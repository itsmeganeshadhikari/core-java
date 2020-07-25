package section6.staticnonstaticdemo;

public class StaticDemo1 {

	// static variable
	static int a = 4;
	static int b = 5;

	// static method
	public static void sayHi() {
		System.out.println("hiiiii");
	}

	public static void main(String[] args) {
		sayHi();
		int sum = a + b;
		System.out.println("sum is: " + sum);

		// best approach
		StaticDemo1.sayHi();
		sum = StaticDemo1.a + StaticDemo1.b;
		System.out.println("sum is: " + sum);
	}
}
