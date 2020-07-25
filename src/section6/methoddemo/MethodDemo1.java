package section6.methoddemo;

public class MethodDemo1 {

	// <access modifier> void <method name>(){
	// //do something
	// }

	// void method with zero arguments
	// method definition
	public static void welcome() {
		System.out.println("Hello, ");
		System.out.println("Welcome to java wolrd...");
	}

	public void greet() {
		System.out.println("Hello, ");
		System.out.println("good morning...");
	}

	public static void main(String[] args) {
		System.out.println("main start");
		// method calling
		welcome();

		MethodDemo1 ob = new MethodDemo1();
		ob.greet();
		System.out.println("main end");
	}
}
