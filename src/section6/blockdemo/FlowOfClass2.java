package section6.blockdemo;

public class FlowOfClass2 {
	static {
		System.out.println("static block1");
	}

	{
		System.out.println("non-static block");
	}

	public FlowOfClass2() {
		System.out.println("default constructor");
	}

	public static void main(String[] args) {
		System.out.println("main");
		FlowOfClass2 obj= new FlowOfClass2();

	}

	static {
		System.out.println("static block2");
	}

	static {
		FlowOfClass2 obj= new FlowOfClass2();
		System.out.println("static block3");
	}
}
