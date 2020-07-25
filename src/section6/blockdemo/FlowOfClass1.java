package section6.blockdemo;

public class FlowOfClass1 {

	static {
		System.out.println("static block1");
	}

	{
		System.out.println("non-static block");
	}

	public FlowOfClass1() {
		System.out.println("default constructor");
	}

	public static void main(String[] args) {
		System.out.println("main");

	}

	static {
		System.out.println("static block2");
	}

	static {
		System.out.println("static block3");
	}
}
