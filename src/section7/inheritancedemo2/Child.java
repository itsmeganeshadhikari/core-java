package section7.inheritancedemo2;

public class Child extends Parent {

	// hiding variable
	String name = "child's name";

	//Overriding method
	public void sayHello() {
		System.out.println("helloooo.. from child");
	}
}
