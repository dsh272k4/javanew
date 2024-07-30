package regular_Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cccd {
	public static void main(String[] args) {
		Pattern pt = Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$");
		Matcher mt = pt.matcher("dsh272k4@gmail.com");
		System.out.println("check " + mt.matches());
	}
}
