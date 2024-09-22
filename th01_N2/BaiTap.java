package th01_N2;

import java.util.Scanner;

public class BaiTap {

	public void bai1() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhập số a: ");
		int a = sc.nextInt();
		System.out.print("Nhập số b: ");
		int b = sc.nextInt();

		// Tính UCLN và BCNN
		int ucln = timUCLN(a, b);
		int bcnn = timBCNN(a, b);

		// Hiển thị kết quả
		System.out.println("UCLN của " + a + " và " + b + " là: " + ucln);
		System.out.println("BCNN của " + a + " và " + b + " là: " + bcnn);

	}

	public int timUCLN(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	public int timBCNN(int a, int b) {
		return (a * b) / timUCLN(a, b); // BCNN = (a * b) / UCLN
	}

	public void bai2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số nguyên dương n: ");
		int n = sc.nextInt();
		if (n >= 0) {
			long ketQua = tinhGiaiThua(n);
			System.out.println("Giai thừa của " + n + " là: " + ketQua);
		} else {
			System.out.println("Vui lòng nhập một số nguyên dương.");
		}
		sc.close();
	}

	public static long tinhGiaiThua(int n) {
		long giaiThua = 1;
		for (int i = 1; i <= n; i++) {
			giaiThua *= i;
		}
		return giaiThua;
	}

	public void bai3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số nguyên dương n: ");
		int n = sc.nextInt();
		if (n > 0) {
			double ketQua = tinhTong(n);
			System.out.println("Tổng S = 1 + 1/2^2 + ... + 1/" + n + "^2 là: " + ketQua);
		} else {
			System.out.println("Vui lòng nhập một số nguyên dương.");
		}

		sc.close();
	}

	public double tinhTong(int n) {
		double tong = 0.0; // Khởi tạo biến tổng là 0.0 (double để tính số thập phân)
		for (int i = 1; i <= n; i++) {
			tong += 1.0 / (i * i); // Cộng dồn giá trị 1 / i^2 vào tổng
		}
		return tong;
	}

	public void bai4() {

	}

	public void bai5() {
	}

	public void bai6() {
	}

	public void bai7() {

	}
}
