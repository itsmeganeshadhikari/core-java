package section7.abstractclassdemo;

//1.If class is an abstract, it is not necessary to have
//abstract method in a class
//2.If class has any abstract method, then class must be
//an abstract
public abstract class AbstractClass {

	// 3.we can not use abstract keyword on variable
	/* abstract */ int a = 3;

	// 4.we can not use final, private and static keyword
	// on abstract method
	public abstract void m1();

	public void m2() {

	}

	public AbstractClass() {
		System.out.println("parent's constructor");
	}
}
