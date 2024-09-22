package th01_N2;

import java.util.Scanner;

public class bai4 {
	// a) Hàm nhập ma trận
	public static int[][] nhapMaTran(int n, int m, Scanner sc) {
		int[][] maTran = new int[n][m];
		System.out.println("Nhập các phần tử của ma trận:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("Nhập phần tử [" + i + "][" + j + "]: ");
				maTran[i][j] = sc.nextInt();
			}
		}
		return maTran;
	}

	// b) Hàm in ma trận
	public static void inMaTran(int[][] maTran, int n, int m) {
		System.out.println("Ma trận đã nhập:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(maTran[i][j] + "\t");
			}
			System.out.println();
		}
	}

	// c) Hàm tìm phần tử nhỏ nhất
	public static int timPhanTuNhoNhat(int[][] maTran, int n, int m) {
		int min = maTran[0][0];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (maTran[i][j] < min) {
					min = maTran[i][j];
				}
			}
		}
		return min;
	}

	// d) Hàm tìm phần tử lẻ lớn nhất
	public static int timPhanTuLeLonNhat(int[][] maTran, int n, int m) {
		int maxLe = Integer.MIN_VALUE; // Khởi tạo giá trị nhỏ nhất
		boolean coPhanTuLe = false; // Kiểm tra có phần tử lẻ hay không

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (maTran[i][j] % 2 != 0) { // Kiểm tra số lẻ
					coPhanTuLe = true;
					if (maTran[i][j] > maxLe) {
						maxLe = maTran[i][j];
					}
				}
			}
		}

		if (coPhanTuLe) {
			return maxLe;
		} else {
			return Integer.MIN_VALUE; // Nếu không có số lẻ, trả về giá trị nhỏ nhất
		}
	}

	// e) Hàm tìm dòng có tổng lớn nhất
	public static int timDongCoTongLonNhat(int[][] maTran, int n, int m) {
		int dongMax = 0;
		int tongMax = 0;

		for (int i = 0; i < n; i++) {
			int tongDong = 0;
			for (int j = 0; j < m; j++) {
				tongDong += maTran[i][j];
			}
			if (i == 0 || tongDong > tongMax) {
				tongMax = tongDong;
				dongMax = i;
			}
		}
		return dongMax;
	}

	// Chương trình chính
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Nhập số dòng và số cột của ma trận
		System.out.print("Nhập số dòng n: ");
		int n = scanner.nextInt();
		System.out.print("Nhập số cột m: ");
		int m = scanner.nextInt();

		// Nhập ma trận
		int[][] maTran = nhapMaTran(n, m, scanner);

		// In ma trận
		inMaTran(maTran, n, m);

		// Tìm phần tử nhỏ nhất
		int min = timPhanTuNhoNhat(maTran, n, m);
		System.out.println("Phần tử nhỏ nhất trong ma trận là: " + min);

		// Tìm phần tử lẻ lớn nhất
		int maxLe = timPhanTuLeLonNhat(maTran, n, m);
		if (maxLe == Integer.MIN_VALUE) {
			System.out.println("Không có phần tử lẻ trong ma trận.");
		} else {
			System.out.println("Phần tử lẻ lớn nhất trong ma trận là: " + maxLe);
		}

		int dongMax = timDongCoTongLonNhat(maTran, n, m);
		System.out.println("Dòng có tổng lớn nhất là dòng: " + (dongMax + 1)); // Dòng hiển thị từ 1

		scanner.close();
	}
}
