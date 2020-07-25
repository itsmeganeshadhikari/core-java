package section7.inheritancedemo3;

public class Child extends Parent{
	

	public Child() {
		System.out.println("child's default constructor");
	}
	
	public Child(int a) {
		System.out.println("child's arg constructor");
	}
}
