package th03_N2;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Box;
import javax.swing.BoxLayout;

class MyFrame extends Frame {
	Label lbTieude;
	Label lbA, lbB, lbC, lbKQ;
	TextField txtA, txtB, txtC, txtKQ;
	Button btnGiai, btnXoa, btnThoat;

	public MyFrame() {
		// Tạo các thành phần
		lbTieude = new Label("Giải phương trình bậc 2", Label.CENTER);
		lbA = new Label("a:");
		lbB = new Label("b:");
		lbC = new Label("c:");
		lbKQ = new Label("Kết quả:");
		txtA = new TextField(10);
		txtB = new TextField(10);
		txtC = new TextField(10);
		txtKQ = new TextField(20);
		txtKQ.setEditable(false);
		btnGiai = new Button("Giải");
		btnXoa = new Button("Xóa");
		btnThoat = new Button("Thoát");

		// Đặt layout là BorderLayout
		this.setLayout(new BorderLayout());

		// Vùng North: tiêu đề
		this.add(lbTieude, BorderLayout.NORTH);

		// Vùng Center: Các ô nhập liệu (dùng Panel với GridLayout để sắp xếp)
		Panel centerPanel = new Panel();
		centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));

		// Tạo các panel nhỏ cho từng cặp nhãn và ô nhập liệu
		Panel row1 = new Panel(new FlowLayout(FlowLayout.CENTER));
		row1.add(lbA);
		row1.add(txtA);

		Panel row2 = new Panel(new FlowLayout(FlowLayout.CENTER));
		row2.add(lbB);
		row2.add(txtB);

		Panel row3 = new Panel(new FlowLayout(FlowLayout.CENTER));
		row3.add(lbC);
		row3.add(txtC);

		Panel row4 = new Panel(new FlowLayout(FlowLayout.CENTER));
		row4.add(lbKQ);
		row4.add(txtKQ);

		// Thêm các panel nhỏ vào centerPanel
		centerPanel.add(row1);
		centerPanel.add(Box.createRigidArea(new Dimension(0, 5))); // Khoảng cách giữa các hàng
		centerPanel.add(row2);
		centerPanel.add(Box.createRigidArea(new Dimension(0, 5))); // Khoảng cách giữa các hàng
		centerPanel.add(row3);
		centerPanel.add(Box.createRigidArea(new Dimension(0, 5))); // Khoảng cách giữa các hàng
		centerPanel.add(row4);

		// Thêm centerPanel vào BorderLayout.CENTER
		this.add(centerPanel, BorderLayout.CENTER);

		// Vùng South: Các nút chức năng
		Panel southPanel = new Panel(new FlowLayout());
		southPanel.add(btnGiai);
		southPanel.add(btnXoa);
		southPanel.add(btnThoat);
		this.add(southPanel, BorderLayout.SOUTH);

		// Xử lý sự kiện đóng cửa sổ
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});

		// Xử lý sự kiện cho nút Xóa
		btnXoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtA.setText("");
				txtB.setText("");
				txtC.setText("");
				txtKQ.setText("");
			}
		});

		// Xử lý sự kiện cho nút Thoát
		btnThoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		// Xử lý sự kiện cho nút Giải
		btnGiai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double a = Double.parseDouble(txtA.getText());
					double b = Double.parseDouble(txtB.getText());
					double c = Double.parseDouble(txtC.getText());
					double delta = b * b - 4 * a * c;

					if (delta < 0) {
						txtKQ.setText("Vô nghiệm");
					} else if (delta == 0) {
						double x = -b / (2 * a);
						txtKQ.setText("x = " + x);
					} else {
						double x1 = (-b + Math.sqrt(delta)) / (2 * a);
						double x2 = (-b - Math.sqrt(delta)) / (2 * a);
						txtKQ.setText("x1 = " + x1 + ", x2 = " + x2);
					}
				} catch (NumberFormatException ex) {
					txtKQ.setText("Nhập liệu sai");
				}
			}
		});

		// Thiết lập kích thước và hiển thị cửa sổ
		this.setSize(400, 250);
		this.setVisible(true);
	}
}

public class Bai1 {
	public static void main(String[] args) {
		new MyFrame();
	}
}
