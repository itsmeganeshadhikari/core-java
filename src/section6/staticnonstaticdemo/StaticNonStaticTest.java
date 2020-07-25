package section6.staticnonstaticdemo;

public class StaticNonStaticTest {

	// main method
	public static void main(String[] args) {
		// non-static calling
		StaticNonStaticDemo o = new StaticNonStaticDemo();
		System.out.println(o.nonStaticVar);
		o.nonStaticMethod();

		// static calling

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

		System.out.println(StaticNonStaticDemo.staticVar);
		StaticNonStaticDemo.staticMethod();
	}

	// another non-static method
	public void m2() {
		// non-static calling

		StaticNonStaticDemo o = new StaticNonStaticDemo();
		System.out.println(o.nonStaticVar);
		o.nonStaticMethod();

		// static calling
		System.out.println(StaticNonStaticDemo.staticVar);
		StaticNonStaticDemo.staticMethod();
	}
}
