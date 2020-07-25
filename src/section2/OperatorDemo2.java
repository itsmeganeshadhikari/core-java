package section2;

public class OperatorDemo2 {

	public static void main(String[] args) {
		// 3.Increment/Decrement Operator
		// ++ --
		// post a++ a--
		// pre ++a --a
		int a = 5;
		System.out.println(a);
		++a;
		System.out.println(a);
		int x = 5;
		System.out.println(x);
		System.out.println(x++);
		System.out.println(x);
		int m = 4;
		int n = m++;
		System.out.println(m);
		System.out.println(n);
		int d= 4;
		d = (d++) + (++d) + d + 1;
		System.out.println(d);

	}

}
