package section3;

public class StringCreationDemo {

	public static void main(String[] args) {
		//Implicit creation
		String s1 = "Hello";
		System.out.println(s1);

		//explicit creation
		String s2 = new String();
		System.out.println(s2);
		String s3 = new String("Hello");
		System.out.println(s3);
		byte[] b1 = { 65, 67, 68 };
		String s4 = new String(b1);
		System.out.println(s4);
		char[] c = { 'a', 'b', 'c' };
		String s5 = new String(c);
		System.out.println(s5);

	}

}
