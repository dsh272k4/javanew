package ngay15_9;

import java.util.Scanner;

public class Test2 {
	public void nhap(int a[], int n, Scanner sc) {
		for (int i = 0; i < n; i++) {
			System.out.println("nhap phan tu thu" + (i + 1) + ":");
			a[i] = sc.nextInt();
		}
	}

	public void xuat(int a[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
		System.out.println("/n");
	}

	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public void QuickSort(int a[], int left, int right) {
		int i = left;
		int j = right;
		int x = a[(left + right) / 2];
		while (i < j) {
			while (a[i] < x)
				i++;
			while (a[j] > x)
				j--;
			if (i <= j) {
				swap(a, i, j);
				i++;
				j--;
			}
		}
		if (left < j)
			QuickSort(a, left, j);
		if (i < right)
			QuickSort(a, i, right);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap n:");
		int n = sc.nextInt();
		int[] a = new int[n];
		Test2 test = new Test2();

		test.nhap(a, n, sc);
		test.xuat(a, n);
		test.QuickSort(a, 0, n - 1);
		System.out.println("mang sau khi sap xep la:");
		test.xuat(a, n);
		sc.close();
	}
}
