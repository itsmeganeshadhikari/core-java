package section3;

public class StringMethodDemo {

	public static void main(String[] args) {

		String s1 = "Hello";
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(2, 5));
		System.out.println(s1.isEmpty());
		System.out.println(s1.length());
		System.out.println(s1.charAt(2));
		System.out.println(s1.indexOf("o"));
		String s2 = " Santosh Lal Karna ";
		System.out.println(s2.indexOf("a"));
		System.out.println(s2.lastIndexOf("a"));
		System.out.println(s2.trim());
		// System.out.println(s2[0]);
		char[] c=s2.toCharArray();
		System.out.println(c[1]);
		System.out.println(c[2]);
		System.out.println(s1.replace(s1, "Hi"));

	}

}
