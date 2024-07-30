package regular_Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static void main(String[] args) {
		Pattern pt = Pattern.compile("dsh", Pattern.CASE_INSENSITIVE);// Pattern.CASE_INSENSITIVE ko phân biệt chữ hoa
																		// với chữ thường
		Matcher mt = pt.matcher("dsh272k4");
		boolean matchFound = mt.find();
		if (matchFound) {
			System.out.println("match found");
		} else {
			System.out.println("match not found");
		}
	}
}
