package bt_String;

import java.util.ArrayList;

public class Baitap {
	public static void main(String[] args) {
		Bai2 std1 = new Bai2("dsh", 1);
		Bai2 std2 = new Bai2("dsh 2", 2);
		Bai2 std3 = new Bai2("ddshd 3", 3);
		Bai2 std4 = new Bai2("dshh 4", 4);
		Bai2 std5 = new Bai2("ddsh 5", 1);

		ArrayList<Bai2> arr = new ArrayList<Bai2>();
		arr.add(std5);
		arr.add(std4);
		arr.add(std3);
		arr.add(std2);
		arr.add(std1);

		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).getName().startsWith("dsh")) {
				System.out.println("start with dsh" + arr.get(i));
			}
		}

		System.out.println("check " + arr);
	}

//	public static void main(String[] args) {
//		System.out.println("Nhap ten:");
//		Scanner sc = new Scanner(System.in);
//		String name = sc.nextLine();
//		System.out.println("nhap vao password:");
//		String pass = sc.nextLine();
//		System.out.println("ten= " + name + " password=" + pass);
////		if (name == "dsh") { loi 
//		if (name.equals("dsh") && pass.length() > 6) {
//			System.out.println("check");
//		}
//		sc.close();
//	}
}
