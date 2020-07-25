package section6.blockdemo;

public class FlowOfClass3 {

	static {
		System.out.println("static block1");
	}

	{
		FlowOfClass3 obj = new FlowOfClass3();
		System.out.println("non-static block");
	}

	public FlowOfClass3() {
		System.out.println("default constructor");
	}

	public static void main(String[] args) {
		System.out.println("main");
	}

	static {
		FlowOfClass3 obj = new FlowOfClass3();
		System.out.println("static block2");
	}
}
