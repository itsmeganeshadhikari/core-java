package section6.staticnonstaticdemo;

public class NonStaticDemo1Test {

	public static void main(String[] args) {

		NonStaticDemo1 obj = new NonStaticDemo1();
		obj.sayHello();

		int sum = obj.a + obj.b;
		System.out.println("Sum is: " + sum);
	}

}
