package p3;

import p1.P;

public class P3 extends p1.P {
	private void test() {
		P object = new P();
		object.a = 10;
		object.b = 9;
		super.c = 8; // protected
	}

	public static void main(String[] args) {
	}
}
