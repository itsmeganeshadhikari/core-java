package section6.staticnonstaticdemo;

public class StaticNonStaticDemo {

	int nonStaticVar = 7;
	static String staticVar = "hello";

	public void nonStaticMethod() {
		System.out.println("non-static method");
	}

	public static void staticMethod() {
		System.out.println("static method");
	}

	// main method
	public static void main(String[] args) {
		// non-static calling
		StaticNonStaticDemo o = new StaticNonStaticDemo();
		System.out.println(o.nonStaticVar);
		o.nonStaticMethod();

		// static calling
		System.out.println(staticVar);
		staticMethod();
		
		System.out.println(StaticNonStaticDemo.staticVar);
		StaticNonStaticDemo.staticMethod();
	}

	// another static method
	public static void m1() {
		// non-static calling
		StaticNonStaticDemo o = new StaticNonStaticDemo();
		System.out.println(o.nonStaticVar);
		o.nonStaticMethod();

		// static calling
		System.out.println(staticVar);
		staticMethod();
		
		System.out.println(StaticNonStaticDemo.staticVar);
		StaticNonStaticDemo.staticMethod();
	}

	// another non-static method
	public void m2() {
		// non-static calling
		System.out.println(nonStaticVar);
		nonStaticMethod();

		//best approach
		StaticNonStaticDemo o = new StaticNonStaticDemo();
		System.out.println(o.nonStaticVar);
		o.nonStaticMethod();

		// static calling
		System.out.println(staticVar);
		staticMethod(); 
		
		System.out.println(StaticNonStaticDemo.staticVar);
		StaticNonStaticDemo.staticMethod();
	}
}
