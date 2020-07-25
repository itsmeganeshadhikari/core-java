package section2;

public class TypeCastingDemo1 {

	public static void main(String[] args) {
		byte b1 = 127;
		// Implicit casting(conversion)
		// by java compiler
		int i1 = b1;
		System.out.println(b1);
		System.out.println(i1);

		int i2 = 127;
		// explicit casting
		// by java programmer
		byte b2 = (byte) i2;
		System.out.println(i2);
		System.out.println(b2);

		int i3 = 200;
		byte b3 = (byte) i3;
		System.out.println(i3);
		System.out.println(b3);
	}

}
