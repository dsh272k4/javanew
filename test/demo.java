package test;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class demo {

	private JFrame frame;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtKQ;

	/**
	 * Chạy ứng dụng.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					demo window = new demo();
					window.frame.setVisible(true); // Hiển thị frame ở đây
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Tạo ứng dụng.
	 */
	public demo() {
		initialize();
	}

	/**
	 * Khởi tạo nội dung cho frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("giai phuong trinh");
		lblNewLabel.setBounds(163, 10, 110, 13);
		frame.getContentPane().add(lblNewLabel);
		JLabel lblNewLabel_1 = new JLabel("He so A:");
		lblNewLabel_1.setBounds(44, 44, 55, 13);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("He so B:");
		lblNewLabel_2.setBounds(44, 78, 55, 13);
		frame.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("ket qua");
		lblNewLabel_3.setBounds(44, 113, 55, 13);
		frame.getContentPane().add(lblNewLabel_3);

		txtA = new JTextField();
		txtA.setBounds(144, 41, 96, 19);
		frame.getContentPane().add(txtA);
		txtA.setColumns(10);

		txtB = new JTextField();
		txtB.setColumns(10);
		txtB.setBounds(144, 75, 96, 19);
		frame.getContentPane().add(txtB);

		txtKQ = new JTextField();
		txtKQ.setEditable(false);
		txtKQ.setColumns(10);
		txtKQ.setBounds(144, 110, 96, 19);
		frame.getContentPane().add(txtKQ);

		JButton btngiai = new JButton("giai pt");
		btngiai.setBounds(73, 167, 96, 39);
		frame.getContentPane().add(btngiai);

		JButton btnxoa = new JButton("xoa");
		btnxoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnxoa.setBounds(177, 167, 96, 39);
		frame.getContentPane().add(btnxoa);

		JButton btnThoat = new JButton("thoat");
		btnThoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnThoat.setBounds(283, 167, 96, 39);
		frame.getContentPane().add(btnThoat);

		btngiai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double a = Double.parseDouble(txtA.getText());
					double b = Double.parseDouble(txtB.getText());

					if (a != 0) {
						double x = -b / a;
						txtKQ.setText("x = " + x);
					} else {
						if (b == 0) {
							txtKQ.setText("Vô số nghiệm!");
						} else {
							txtKQ.setText("Vô nghiệm!");
						}

					}
				} catch (NumberFormatException ex) {
					txtKQ.setText("Vui lòng nhập số liệu cụ thể!");
				}
			}
		});
		btnxoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtA.setText(""); // Xóa nội dung TextField A
				txtB.setText(""); // Xóa nội dung TextField B
				txtKQ.setText(""); // Xóa kết quả
			}
		});

		// Sự kiện cho nút Thoát
		btnThoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0); // Thoát chương trình
			}
		});
	}

}
