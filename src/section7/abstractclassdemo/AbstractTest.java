package section7.abstractclassdemo;

public class AbstractTest {

	public static void main(String[] args) {
		// we can not create an object of abstract class
		// AbstractClass obj= new AbstractClass();

		AbstractClass o = new AbstractClassChild();
		o.m1();

	}

}
