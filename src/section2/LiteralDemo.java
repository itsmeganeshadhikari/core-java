package section2;

public class LiteralDemo {

	public static void main(String[] args) {
		// 1.Integer Literal 353 54654 77 58678678(int)
		byte b = 127;
		short s = 4543;
		int i = 4643543;
		long l = 2147483648L;
		// 2.Floating Literal: 32.56 45345.34534(double)
		double d = 45.36;
		float f = 45.36F;
		// 3.Boolean Literal
		boolean b1 = true;
		boolean b2 = false;
		// 4.Character Literal: 'a' '1' '+'
		char c1 = 'a';
		char c2 = '1';
		char c3 = '+';
		char c4 = '\u0000';
		System.out.println(c4);
		char c5 = 0;
		char c6 = 65535;
		// 5.String Literal: "Hell0" "" "1223"
		String s1 = "Hello";
		String s2 = "";
		String s3 = "100";
		String s4 = "abc@123#";

		// 6.Null Literal null
		String s5 = null;

		// This is an object
		LiteralDemo obj = new LiteralDemo();
		LiteralDemo o = null;
	}

}
// Literals: a source code representation of fixed value
// Literals => fixed value+data type