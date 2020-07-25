package section7.inheritancedemo4;

public class Child extends Parent {

	// hiding variable
	String name = "child's name";

	//Overriding method
	public void sayHello() {
		System.out.println(name);
		System.out.println(super.name);
		System.out.println("helloooo.. from child");
		super.sayHello();
	}
}
