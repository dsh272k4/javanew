package dsh_test;

import java.util.Scanner;

public class dsh_1 {
	public static void main(String[] args) {
		Scanner dsh = new Scanner(System.in);
		System.out.println("nhap hoten");
		String ht = dsh.nextLine();
		System.out.println("nhap ngay");
		int ngay = dsh.nextInt();
		System.out.println("nhap diem");
		float diem = dsh.nextFloat();

		System.out.println("hovaten: " + ht + " ngay: " + ngay + "diem: " + diem);
		dsh.close();
	}

}
