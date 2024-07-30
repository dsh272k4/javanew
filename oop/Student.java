package oop;

public class student {

	private String name;
	private int age;

	public student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getname() {
		return "nguyen van " + this.name;
	}

	public int getAge() {
		return this.age;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

//	String name;
//	int tuoi;

	public void java() {
		System.out.println("chay oop");
	}

	int gettuoi() {
		return 25;
	}
}
