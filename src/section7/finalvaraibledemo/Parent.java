package section7.finalvaraibledemo;

//1.we can not extends final class
public /* final */ class Parent {

	// 2.we can not override final method
	public /* final */ void sayHello() {
		System.out.println("hello from parent");
	}
	
	//3.we can not use final keyword on constructor
	public /*final*/ Parent() {
		// TODO Auto-generated constructor stub
	}
	
	final int a=3;
	
	
}
