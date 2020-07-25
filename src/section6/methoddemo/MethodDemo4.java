package section6.methoddemo;

public class MethodDemo4 {

	public String sayHello() {
		return "Hello";
	}

	public static void greet(MethodDemo4 obj) {
		System.out.println(obj.sayHello() + " welcome to my world...");
	}

	public static void main(String[] args) {
		MethodDemo4 obj= new MethodDemo4();
		greet(obj);
	}

}
