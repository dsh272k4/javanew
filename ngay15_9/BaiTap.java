package ngay15_9;

import java.util.Scanner;

public class BaiTap {
	public void bai1() {
		System.out.println("nhap so luong phan tu:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
			a[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += a[i];
		}
		System.out.println("Tổng các phần tử trong mảng là: " + sum);
		sc.nextLine();
	}

	public void bai2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao mot chuoi");
		int count = 0;
		String a = sc.nextLine();
		for (int i = 0; i < a.length(); i++) {
			char c = a.charAt(i);

			if (Character.isLetterOrDigit(c)) {
				count++;
			}
		}
		System.out.println("Số lượng ký tự không phải khoảng trắng và dấu câu: " + count);

	}

	public void bai3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap N:");
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("nhap phan tu thu" + (i + 1));
			a[i] = sc.nextInt();
		}
		int max = a[0];
		for (int i = 1; i < n; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		System.out.println("phan tu lon nhat trong mang la:" + max);
		sc.close();
	}
}
