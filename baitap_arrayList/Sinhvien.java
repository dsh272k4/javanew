package baitap_arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Sinhvien {
	private int msv;
	private String ten;

	public Sinhvien() {
	}

	public Sinhvien(int msv, String ten) {
		this.msv = msv;
		this.ten = ten;
	}

//	public Sinhvien nhap(int msv, String ten) {
//		Sinhvien sv = new Sinhvien(msv, ten);
//		return sv;
//	}

//	public void xuat(Sinhvien sv) {
//		System.out.println("msv=" + sv.getMsv() + "name=" + sv.ten);
//	}

	public int getMsv() {
		return msv;
	}

	public void setMsv(int msv) {
		this.msv = msv;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String toString() {
		return "msv=" + msv + ", ten=" + ten;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Sinhvien> a = new ArrayList<Sinhvien>();

		while (true) {
			System.out.println("nhap ID:");
			int msv = sc.nextInt();
			sc.nextLine();

			System.out.println("nhap ten:");
			String ten = sc.nextLine();

			Sinhvien sv = new Sinhvien(msv, ten);
			a.add(sv);
			System.out.println("continue ? Y or N??");
			String option = sc.nextLine();
			if (option.equals("N") || option.equals("n")) {
				break;
			}
		}
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}

		sc.close();
	}
}
