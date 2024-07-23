package dsh_test;

import java.util.Scanner;

public class dsh_3 {
	public static void main(String[] args) {
		Scanner dsh = new Scanner(System.in);
		System.out.println("nhap chieu dai canh:");
		int a = dsh.nextInt();
		System.out.println("the tich =" + Math.pow(a, 3));
		dsh.close();
	}
}
