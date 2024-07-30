package baitap_oop;

public class runProduct {
	public static void main(String[] args) {
		Product test = new Product();
		Product pr1 = test.nhap("dsh", 200, 10);
		test.xuat(pr1);
		System.out.println("tax= " + test.getTexPrice(pr1.getPrice(), pr1.getTax()));
	}
}
