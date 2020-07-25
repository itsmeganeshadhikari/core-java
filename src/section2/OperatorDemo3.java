package section2;

import javax.sound.midi.Soundbank;

public class OperatorDemo3 {

	public static void main(String[] args) {
		// Logical operator: && || !

		boolean a = true;
		boolean b = false;
		System.out.println(a && b);
		System.out.println(a || b);
		System.out.println(!a);

		// Relational operator: < > >= <= == !=

		int x = 4;
		int y = 3;
		System.out.println(x > y);
		System.out.println(x < y);
		System.out.println(x <= y);
		System.out.println(x >= y);
		System.out.println(x == y);

		System.out.println(x != y);

	}
}
