package section6.blockdemo;

public class StaticBlock {
	static int a;

	static {
		System.out.println(a);
		System.out.println("static block1");
	}

	public static void main(String[] args) {
		System.out.println("main");
	}

	static {
		System.out.println("static block2");
		sayHello();
//		System.exit(0);
	}
	
	public static void sayHello() {
		System.out.println("helloo....");
	}
}
