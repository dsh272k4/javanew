package baitap_arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class baitap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Double> a = new ArrayList<Double>();

		while (true) {
			System.out.println("nhap vao so thuc");
			double x = sc.nextDouble();
			a.add(x);
			sc.nextLine();// bang enter
			System.out.println("continue ? Y or N??");
			String option = sc.nextLine();
			if (option.equals("N") || option.equals("n")) {
				break;
			}
		}
		System.out.println("check=" + a);
		double sum = 0;
		for (int i = 0; i < a.size(); i++) {
			sum += a.get(i);
		}
		System.out.println("check=" + sum);
	}
}
