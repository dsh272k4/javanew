package inheritance;

public class Run_inheritance {
	public static void main(String[] args) {
		System.out.println("test");
		SinhvienIT st1 = new SinhvienIT("java", "123", "dsh", 10, 0.2);
		System.out.println("check=" + st1.id);
		SinhvienCoKhi st2 = new SinhvienCoKhi("good", "123", "dsh", 10, 0.2);
		System.out.println("check=" + st2.name);
	}
}
