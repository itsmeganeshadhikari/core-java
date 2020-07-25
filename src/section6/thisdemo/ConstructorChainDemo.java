package section6.thisdemo;

public class ConstructorChainDemo {

	public ConstructorChainDemo() {
		this(2);
		System.out.println("default constructor");
	}

	public ConstructorChainDemo(int a) {
		this(2, 3);
		System.out.println("1-arg constructor");
	}

	public ConstructorChainDemo(int a, int b) {
		System.out.println("2-arg constructor");
	}

	public static void main(String[] args) {
		ConstructorChainDemo obj1 = new ConstructorChainDemo();

	}

}
