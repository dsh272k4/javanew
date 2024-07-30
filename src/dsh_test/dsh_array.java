package dsh_test;

import java.util.Arrays;
import java.util.Scanner;

public class dsh_array {
	public static void main(String[] args) {
//		int[] a = { 1, 2, 3 };
//		System.out.println("mang a=" + Arrays.toString(a));
//		// tostring = giá trị của mảng
//		System.out.println("chieu dai mang= " + a.length);
//		System.out.println("gia trị thu 2 là: " + a[1]);
//		String[] b = new String[5];
//		b[0] = "1";
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap n:");
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("gia tri cua mang a=" + Arrays.toString(a));

//		for (int i = 0; i < a.length - 1; i++) {
//			for (int j = i + 1; j < a.length; j++) {
//				if (a[i] > a[j]) {
//					int doi = a[i];
//					a[i] = a[j];
//					a[j] = doi;
//				}
//			}
//		}
		Arrays.sort(a);
		System.out.println("gia tri cua mang sau sap xep a=" + Arrays.toString(a));
		sc.close();
	}
}
