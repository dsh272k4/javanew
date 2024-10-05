package th03_N1;

import java.awt.Checkbox;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Democheckbox extends Frame implements ItemListener {

	private Checkbox checkBold;
	private Checkbox checkItalic;
	private TextField txtText;

	public Democheckbox() {
		// Thiết lập Frame
		this.setLayout(null); // Tắt layout manager để có thể đặt vị trí tùy ý cho các thành phần
		this.setTitle("Demo Checkbox");
		this.setSize(400, 200);

		// Tạo các thành phần
		checkBold = new Checkbox("Bold");
		checkItalic = new Checkbox("Italic");

		// Đặt vị trí cho các thành phần
		checkBold.setBounds(50, 100, 100, 30); // x, y, width, height
		checkItalic.setBounds(150, 100, 100, 30);

		// Thêm sự kiện
		checkBold.addItemListener(this);
		checkItalic.addItemListener(this);

		// Thiết lập TextField
		txtText = new TextField("Sample Text", 16);
		Font font = new Font("Courier", Font.PLAIN, 14);
		txtText.setFont(font);
		txtText.setBounds(50, 50, 300, 30); // Đặt vị trí cho TextField

		// Thêm các thành phần vào Frame
		this.add(txtText);
		this.add(checkBold);
		this.add(checkItalic);

		// Sự kiện đóng cửa sổ
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0); // Đóng chương trình khi nhấn nút X
			}
		});

		// Hiển thị Frame
		this.setVisible(true);
	}

	// Xử lý sự kiện khi chọn ô Checkbox
	public void itemStateChanged(ItemEvent event) {
		int valBold = Font.PLAIN;
		int valItalic = Font.PLAIN;
		if (checkBold.getState())
			valBold = Font.BOLD;
		if (checkItalic.getState())
			valItalic = Font.ITALIC;
		Font font = new Font("Courier", valBold + valItalic, 14);
		txtText.setFont(font);
	}
}

public class Bai1 {
	public static void main(String[] args) {
		new Democheckbox(); // Gọi đến lớp tạo giao diện
	}
}
