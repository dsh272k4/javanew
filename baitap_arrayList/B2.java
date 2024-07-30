package baitap_arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class B2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Double> a = new ArrayList<Double>();

		while (true) {
			System.out.println("nhap vao so thuc :");
			;
			double x = sc.nextDouble();
			a.add(x);
			sc.nextLine();
			System.out.println("nhap lua chon");
			String option = sc.nextLine();
			if (option.equals("N") || option.equals("n")) {
				break;
			}
		}
		System.out.println("a= " + a);
	}
}
