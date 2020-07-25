package section6.staticnonstaticdemo;

public class NonStaticDemo1 {
	// non-static(instance) variable
	int a = 5;
	int b = 4;

	//non-static method
	public void sayHello() {
		System.out.println("hellooo...");
	}

	public static void main(String[] args) {
		NonStaticDemo1 obj = new NonStaticDemo1();
		obj.sayHello();

		int sum = obj.a + obj.b;
		System.out.println("Sum is: " + sum);
	}
}
