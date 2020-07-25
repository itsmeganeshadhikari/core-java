package section2;

public class TypeCastingDemo3 {

	public static void main(String[] args) {
		char c1 = 65;
		short s1 = 65;
		System.out.println(c1);
		System.out.println(s1);

		char c2 = 'a';
		short s2 = 'a';
		System.out.println(c2);
		System.out.println(s2);

		char c3 = 'A';
		short s3 = (short) c3;
		System.out.println(c3);
		System.out.println(s3);

		short s4 = 68;
		char c4 = (char) s4;
		System.out.println(s4);
		System.out.println(c4);

	}

}
