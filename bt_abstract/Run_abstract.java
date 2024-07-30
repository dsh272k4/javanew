package bt_abstract;

public class Run_abstract {
	public static void main(String[] args) {
		Sinhvien it1 = new SinhvienIT(10, 7);
		System.out.println("check svIT=" + it1.getScore());
		Sinhvien cokhi1 = new SinhvienCoKhi(8, 10);
		System.out.println("check svck=" + cokhi1.getScore());
	}
}
