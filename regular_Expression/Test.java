package regular_Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	public static void main(String[] args) {
		Pattern pt = Pattern.compile("[0-9]{6,12}");
		Matcher mt = pt.matcher("1234567");
		System.out.println("check " + mt.matches());
	}
}
