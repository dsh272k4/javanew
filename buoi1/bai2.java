package buoi1;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MyAction implements ActionListener {
	private Frame frm; // Biến để lưu tham chiếu đến Frame

	// Hàm khởi tạo để truyền tham chiếu Frame
	public MyAction(Frame frm) {
		this.frm = frm;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Button btnTarget = (Button) e.getSource();
		System.out.println("Pressed " + btnTarget.getLabel() + "!!!!!!");

		// Thay đổi màu nền của Frame dựa trên nút nhấn
		switch (btnTarget.getLabel()) {
		case "Red":
			this.frm.setBackground(Color.red);
			break;
		case "Green":
			this.frm.setBackground(Color.green);
			break;
		case "Blue":
			this.frm.setBackground(Color.blue);
			break;
		default:
			this.frm.setBackground(Color.white);
			break;
		}
	}
}

class MyFrame1 extends Frame {
	Button btnRed, btnGreen, btnBlue;

	public MyFrame1() {
		this.setLayout(new FlowLayout());

		// Tạo các nút bấm
		btnRed = new Button("Red");
		btnGreen = new Button("Green");
		btnBlue = new Button("Blue");

		// Thêm các nút vào Frame
		this.add(btnRed);
		this.add(btnGreen);
		this.add(btnBlue);

		// Thiết lập hành động khi nhấn các nút
		MyAction actionHandler = new MyAction(this);
		btnRed.addActionListener(actionHandler);
		btnGreen.addActionListener(actionHandler);
		btnBlue.addActionListener(actionHandler);

		// Thiết lập kích thước và hiển thị Frame
		this.setSize(400, 200);
		this.setVisible(true);

		// Xử lý sự kiện đóng cửa sổ
		this.addWindowListener(new WindowAdapter() {
			@Override

			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
}

public class bai2 {
	public static void main(String[] args) {
		MyFrame1 frm1 = new MyFrame1(); // Khởi tạo và hiển thị MyFrame
	}
}
