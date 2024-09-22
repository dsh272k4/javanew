package th01_N2;

import java.util.Scanner;

public class bai5 {
	// Thuộc tính 3 cạnh của tam giác
	private int ma;
	private int mb;
	private int mc;

	// Hàm khởi tạo mặc định
	public bai5() {
		this.ma = 0;
		this.mb = 0;
		this.mc = 0;
	}

	// Hàm khởi tạo với tham số
	public bai5(int a, int b, int c) {
		if (a < 0 || b < 0 || c < 0) {
			System.out.println("Cạnh không thể âm. Gán giá trị 0 cho các cạnh.");
			this.ma = 0;
			this.mb = 0;
			this.mc = 0;
		} else if (!laTamGiac(a, b, c)) {
			System.out.println("Không phải hình tam giác. Gán giá trị 0 cho các cạnh.");
			this.ma = 0;
			this.mb = 0;
			this.mc = 0;
		} else {
			this.ma = a;
			this.mb = b;
			this.mc = c;
		}
	}

	// Getter và Setter cho các cạnh của tam giác
	public int getCanhA() {
		return ma;
	}

	public void setCanhA(int v) {
		if (v > 0 && laTamGiac(v, this.mb, this.mc)) {
			this.ma = v;
		} else {
			System.out.println("Không thể gán cạnh a vì không lập thành tam giác hợp lệ.");
		}
	}

	public int getCanhB() {
		return mb;
	}

	public void setCanhB(int v) {
		if (v > 0 && laTamGiac(this.ma, v, this.mc)) {
			this.mb = v;
		} else {
			System.out.println("Không thể gán cạnh b vì không lập thành tam giác hợp lệ.");
		}
	}

	public int getCanhC() {
		return mc;
	}

	public void setCanhC(int v) {
		if (v > 0 && laTamGiac(this.ma, this.mb, v)) {
			this.mc = v;
		} else {
			System.out.println("Không thể gán cạnh c vì không lập thành tam giác hợp lệ.");
		}
	}

	// Hàm kiểm tra 3 cạnh có lập thành tam giác hay không
	public boolean laTamGiac() {
		return laTamGiac(this.ma, this.mb, this.mc);
	}

	// Hàm kiểm tra 3 cạnh bất kỳ có lập thành tam giác không
	public boolean laTamGiac(int a, int b, int c) {
		return (a + b > c) && (a + c > b) && (b + c > a);
	}

	// Hàm tính chu vi tam giác
	public int getChuVi() {
		if (laTamGiac()) {
			return ma + mb + mc;
		} else {
			return 0;
		}
	}

	// Hàm tính diện tích tam giác theo công thức Heron
	public double getDienTich() {
		if (laTamGiac()) {
			double p = getChuVi() / 2.0; // Nửa chu vi
			return Math.sqrt(p * (p - ma) * (p - mb) * (p - mc)); // Công thức Heron
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		// Nhập từ bàn phím
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập cạnh a: ");
		int a = scanner.nextInt();
		System.out.print("Nhập cạnh b: ");
		int b = scanner.nextInt();
		System.out.print("Nhập cạnh c: ");
		int c = scanner.nextInt();

		// Tạo đối tượng HinhTamGiac
		bai5 hinhTamGiac = new bai5(a, b, c);

		if (hinhTamGiac.laTamGiac()) {
			System.out.println("Chu vi tam giác: " + hinhTamGiac.getChuVi());
			System.out.println("Diện tích tam giác: " + hinhTamGiac.getDienTich());
		} else {
			System.out.println("Ba cạnh không lập thành một hình tam giác.");
		}

		scanner.close();
	}
}
