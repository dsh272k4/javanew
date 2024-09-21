package buoi1;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class test {
	public static void main(String[] args) {
		Frame frm = new Frame();
		Label lb = new Label("nguyen van duong", Label.CENTER);
		frm.add(lb);
		frm.setSize(200, 200);
		frm.setVisible(true);
		frm.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
}
