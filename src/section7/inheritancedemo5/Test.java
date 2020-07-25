package section7.inheritancedemo5;

public class Test {

	public static void main(String[] args) {

		// Implicit object casting(upcasting)
		Parent p = new Child();
		p.sayHello();
		// p.sayHi();

		// Explicit object casting(downcasting)
		// Parent pp = new Parent();
		// Child c = (Child) pp;
	}

}
