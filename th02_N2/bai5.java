package th02_N2;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;

class MyFrame5 extends Frame {
	Label lbTieuDe;
	Label lbsoluong;
	Label lbnhap;
	Label lbHienThi;
	Label lbTong;
	Label lbSapxep;
	TextField txtSL, txtNhap, txtHT, txtTong, txtSX;
	Button btnNhap;
	Button btnThucHien;
	Button btnXoa;
	Button btnThoat;

	int[] array;
	int index = 0;

	public MyFrame5() {
		lbTieuDe = new Label("nhap mang va sap xep");
		lbsoluong = new Label("Nhap so pt mang:");
		txtSL = new TextField(10);
		lbnhap = new Label("nhap phan tu:");
		txtNhap = new TextField(10);
		lbHienThi = new Label("Mang da nhap:");
		txtHT = new TextField(10);
		txtHT.setEditable(false);
		lbTong = new Label("Tinh tong:");
		txtTong = new TextField(10);
		txtTong.setEditable(false);
		lbSapxep = new Label("Sap Xep:");
		txtSX = new TextField(10);
		txtSX.setEditable(false);
		btnNhap = new Button("nhap");
		btnThucHien = new Button("Thuc hien");
		btnXoa = new Button("xoa");
		btnThoat = new Button("Thoat");

		this.setLayout(new FlowLayout());
		this.add(lbsoluong);
		this.add(txtSL);
		this.add(lbnhap);
		this.add(txtNhap);
		this.add(lbHienThi);
		this.add(txtHT);
		this.add(txtHT);
		this.add(lbTong);
		this.add(txtTong);
		this.add(txtTong);
		this.add(lbSapxep);
		this.add(txtSX);
		this.add(btnNhap);
		this.add(btnThucHien);
		this.add(btnXoa);
		this.add(btnThoat);

		this.setSize(400, 300);
		this.setVisible(true);

		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});

		btnXoa.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				txtSL.setText("");
				txtNhap.setText("");
				txtHT.setText("");
				txtTong.setText("");
				txtSX.setText("");
				index = 0;
			}
		});

		btnThoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		btnNhap.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					// Khởi tạo mảng khi lần đầu nhấn nút
					if (array == null) {
						int size = Integer.parseInt(txtSL.getText());
						array = new int[size]; // Tạo mảng với kích thước đã nhập
					}

					if (index < array.length) {
						// Lấy phần tử nhập vào và thêm vào mảng
						int num = Integer.parseInt(txtNhap.getText());
						array[index] = num;
						index++;

						// Hiển thị mảng hiện tại
						txtHT.setText(Arrays.toString(array).replaceAll("[\\[\\]]", ""));
					} else {
						txtNhap.setText("Array Full"); // Mảng đã đầy
					}

					txtNhap.setText(""); // Xóa TextField để nhập tiếp
				} catch (NumberFormatException ex) {
					txtNhap.setText("Lỗi nhập liệu"); // Lỗi nhập liệu
				}
			}
		});
		btnThucHien.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (array != null && index > 0) {
					// Tính tổng mảng
					int sum = 0;
					for (int num : array) {
						sum += num;
					}
					txtTong.setText(String.valueOf(sum));

					// Sắp xếp mảng theo thứ tự giảm dần
					Arrays.sort(array);
					int[] sortedArray = new int[array.length];
					for (int i = 0; i < array.length; i++) {
						sortedArray[i] = array[array.length - 1 - i]; // Đảo ngược mảng đã sắp xếp
					}

					// Hiển thị mảng đã sắp xếp
					txtSX.setText(Arrays.toString(sortedArray).replaceAll("[\\[\\]]", ""));
				} else {
					txtTong.setText("No Data");
					txtSX.setText("No Data");
				}
			}
		});
	}
}

public class bai5 {
	public static void main(String[] args) {
		MyFrame5 tinhtong = new MyFrame5();
	}
}
