package section6.staticnonstaticdemo;

public class StaticDemo1Test {

	public static void main(String[] args) {
		// sayHi();
		// int sum = a + b;
		// System.out.println("sum is: " + sum);

		//best approach
		StaticDemo1.sayHi();
		int sum = StaticDemo1.a + StaticDemo1.b;
		System.out.println("sum is: " + sum);
	}

}
