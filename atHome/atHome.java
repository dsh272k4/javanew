package atHome;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MyFrame extends Frame {
	Label lbTieuDe;
	Label lbInKQ;
	Button btn;
	int x = 0;

	public MyFrame() {
		lbTieuDe = new Label("Bạn yêu đương bn lần?");
		lbInKQ = new Label("Số lần = ...", Label.CENTER);
		btn = new Button("Thêm");

		this.setLayout(new FlowLayout());
		this.add(lbTieuDe);
		this.add(lbInKQ);
		this.add(btn);

		this.setSize(300, 150);

		// Xử lý sự kiện đóng cửa sổ
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});

		// Xử lý sự kiện khi nhấn nút "Thêm"
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				x = x + 1; // Tăng biến x
				lbInKQ.setText("Số lần = " + x); // Hiển thị giá trị mới của x
			}
		});

		this.setVisible(true);
	}
}

public class atHome {
	public static void main(String[] args) {
		MyFrame test = new MyFrame(); // Tạo đối tượng MyFrame và hiển thị giao diện
	}
}
