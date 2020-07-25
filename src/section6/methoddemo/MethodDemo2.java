package section6.methoddemo;

public class MethodDemo2 {

	// <access modifier> void <method name>(args if any){
	// //do something
	// }
	// void method with any numbers and any type of arguments
	public void sum(int a, int b) {
		int add = a + b;
		System.out.println("The sum is: " + add);
	}

	public void printInfo(String name, int age) {
		System.out.println("Name is: " + name);
		System.out.println("age is: " + age);
	}

	public static void main(String[] args) {
		MethodDemo2 obj = new MethodDemo2();
		obj.sum(2, 3);
		
		String n="ram";
		int a=20;
		obj.printInfo(n, a);
	}
}
