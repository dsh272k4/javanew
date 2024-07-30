package dsh_test;

import java.util.Scanner;

public class dsh_switch {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap thu bang so");
		n = sc.nextInt();
		switch (n) {
		case 1: {
			System.out.println("星期一");
			break;
		}
		case 2: {
			System.out.println("星期二");
			break;
		}
		case 3: {
			System.out.println("星期三");
			break;
		}
		case 4: {
			System.out.println("星期四");
			break;
		}
		case 5: {
			System.out.println("星期五");
			break;
		}
		case 6: {
			System.out.println("星期六");
			break;
		}
		case 7: {
			System.out.println("星期天 (hoặc 星期日) xīngqī tiān (hoặc xīngqī rì)");
			break;
		}
		default:
			System.out.println("nhap sai! nhap lai.");
		}
		sc.close();

	}
}
