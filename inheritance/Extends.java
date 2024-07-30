package inheritance;

class Animal {
	void eat() {
		System.out.println("animal");
	}
}

class Dog extends Animal {
	void eat() {
		System.out.println("dog");
	}
}

class babydog extends Dog {
	void eat() {
		System.out.println("babydog");
	}
}

class cat extends Animal {
	void eat() {
		System.out.println("cat");
	}
}

public class Extends {
	public static void main(String[] args) {
		Animal a = new babydog();
		Animal b = new cat();
		a.eat();
		b.eat();
	}
}
