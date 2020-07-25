package section2;

public class TypeCastingDemo2 {

	public static void main(String[] args) {
		// no type conversion of boolean
		// boolean b=true;
		// int i=(int)b;

		// int i=10;
		// boolean b=(boolean)i;

		char c1 = 65;
		double d1 = c1;
		System.out.println(c1);
		System.out.println(d1);

		double d2 = 97;
		char c2 = (char) d2;
		System.out.println(d2);
		System.out.println(c2);
	}

}
