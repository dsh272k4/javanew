package buoi1;
//

//import java.awt.Frame;
//import java.awt.Label;
//
//public class bai1 {
//	public static void main(String[] args) {
//		Frame frm = new Frame();
//		Label lb = new Label("nguyen van duong", Label.CENTER);
//		frm.add(lb);
//		frm.setSize(200, 200);
//		frm.setVisible(true);
//	}
//}

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MyFrame extends Frame {

	Label lbTieuDe;
	Label lbA;
	Label lbB;
	Label lbInKQ;
	TextField txtA, txtB;
	Button btnGiai;

	public MyFrame() {
		lbTieuDe = new Label("Giải phương trình ax+b = 0");
		lbA = new Label("A =");
		lbB = new Label("B =");
		lbInKQ = new Label("x =...............", Label.CENTER);
		txtA = new TextField(10);
		txtB = new TextField(10);
		btnGiai = new Button("Giải PT");

		this.setLayout(new FlowLayout());
		this.add(lbTieuDe);
		this.add(lbA);
		this.add(txtA);
		this.add(lbB);
		this.add(txtB);
		this.add(btnGiai);
		this.add(lbInKQ);

		this.setSize(300, 150);

		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});

		btnGiai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double a = Double.parseDouble(txtA.getText());
					double b = Double.parseDouble(txtB.getText());

					if (a != 0) {
						double x = -b / a;
						lbInKQ.setText("x = " + x);
					} else {
						if (b == 0) {
							lbInKQ.setText("Vô số nghiệm!");
						} else {
							lbInKQ.setText("Vô nghiệm!");
						}
					}
				} catch (NumberFormatException ex) {
					lbInKQ.setText("Vui lòng nhập số liệu cụ thể!");
				}
			}
		});

		this.setVisible(true);
	}
}

public class bai1 {
	public static void main(String[] args) {
		MyFrame frmGiaiPT = new MyFrame();
	}
}

// Quy tắc đặt tên cho các compoments:
// kí hiệu viết tắt của compoments + chức nắng của nó:
// Lb - Tiêude -> nhãn hiệu của tiêu đề;
// txt1 -> TextField nhập giá trị cho a;
