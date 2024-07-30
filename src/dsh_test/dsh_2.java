package dsh_test;

import java.util.Scanner;

public class dsh_2 {
	public static void main(String[] args) {
		Scanner dsh = new Scanner(System.in);
		System.out.println("nhap a:");
		int a = dsh.nextInt();
		System.out.println("nhap b:");
		int b = dsh.nextInt();
		int c = Math.max(a, b);
		System.out.println("max:" + c);
		dsh.close();
	}
}
