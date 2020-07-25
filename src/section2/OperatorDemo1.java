package section2;

public class OperatorDemo1 {

	public static void main(String[] args) {
		// 1.Arithmetic Operators: + - / * %
		// Precedence(priority) + -(low) * / %(high)
		// Associativity: Left to right
		int a = 4 + 5 - 7 % 2 - 3 * 2 + 6 / 2;
		System.out.println(a);

		// 2.Assignment operator: = += -= *= /= %=
		// Associativity: right to left

		int x = 4;
		System.out.println(x);
		x += 5;// x=x+5;
		System.out.println(x);

	}

}
