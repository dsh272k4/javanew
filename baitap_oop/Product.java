package baitap_oop;

public class Product {
	private String name;
	private double price; // gia
	private double tax;// thue

	public Product() {
	}

	public Product(String name, double price, double tax) {
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	public Product nhap(String name, double price, double tax) {
		Product pr = new Product(name, price, tax);
		return pr;

	}

	public void xuat(Product pr) {
		System.out.println("name= " + pr.getName() + " price =" + pr.getPrice() + " tax=" + pr.getTax());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double getTexPrice(double price, double tax) {
		return price * tax;
	}

}
