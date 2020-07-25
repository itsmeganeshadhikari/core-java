package section3;

public class StringRegexDemo {

	public static void main(String[] args) {
		System.out.println(isTrue("Yes"));
		System.out.println(isAlphabetOnly("hello12"));
		System.out.println(isNumberOnly("333"));
	}

	public static boolean isTrue(String s) {
		return s.matches("[T|t]rue|[Y|y]es");
	}
	
	public static boolean isAlphabetOnly(String s) {
		return s.matches("[^0-9]*");
	}
	
	public static boolean isNumberOnly(String s) {
		return s.matches("[0-9]+");
	}
	
	
}
