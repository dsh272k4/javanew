package dsh_test;

import java.util.Scanner;

public class dsh_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap a:");
		int a = sc.nextInt();
		String kq = (a % 2 == 0) ? "so chan" : "so le";
		System.out.println(kq);
		sc.close();
	}
}
