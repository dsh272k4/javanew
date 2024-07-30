package inheritance;

public abstract class Sinhvien {
	protected String id;
	protected String name;
	protected double price;
	protected double tax;

	abstract void TinhDiem();

	public Sinhvien(String id, String name, double price, double tax) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	public double getPriceTax() {
		return this.price * this.tax;
	}

	public void info() {
		System.out.println("run sv");
	}
}
