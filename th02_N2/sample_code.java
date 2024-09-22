package th02_N2;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class sample_code {
	static class DemoButton extends Frame implements ActionListener {
		private Button btnBlue;
		private Button btnWhite;
		private Button btnHello;

		public DemoButton() {
			// Khởi tạo frame và các nút trong constructor
			btnBlue = new Button("Blue");
			btnWhite = new Button("White"); // Sửa lại lỗi chính tả White
			btnHello = new Button("Hello");

			// Thiết lập layout và thêm các nút vào frame
			this.setLayout(null);
			btnBlue.setBounds(50, 100, 80, 30);
			btnWhite.setBounds(150, 100, 80, 30);
			btnHello.setBounds(100, 150, 80, 30);

			this.add(btnBlue);
			this.add(btnWhite);
			this.add(btnHello);

			// Thêm ActionListener cho các nút
			btnBlue.addActionListener(this);
			btnWhite.addActionListener(this);
			btnHello.addActionListener(this);

			// Cài đặt thuộc tính của frame
			this.setSize(300, 300);
			this.setTitle("Button Demo");

			// Xử lý sự kiện đóng cửa sổ
			this.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent we) {
					dispose();
				}
			});
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnHello) {
				javax.swing.JOptionPane.showMessageDialog(this, "Hello!!!");
			} else if (e.getSource() == btnBlue) {
				this.setBackground(Color.BLUE);
			} else if (e.getSource() == btnWhite) {
				this.setBackground(Color.WHITE);
			}
			repaint(); // Vẽ lại cửa sổ để cập nhật màu nền
		}
	}

	public static void main(String[] args) {
		DemoButton frame = new DemoButton();
		frame.setVisible(true);
	}
}
