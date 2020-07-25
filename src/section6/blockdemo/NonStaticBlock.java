package section6.blockdemo;

public class NonStaticBlock {
	String message;
	{
		System.out.println("non-static block1");
	}

	public void displayMessage() {
		System.out.println(message);
	}

	public NonStaticBlock(String m) {
		message = m;
		System.out.println("arg constructor");
	}

	public NonStaticBlock() {
		System.out.println("default constructor");
	}

	public static void main(String[] args) {

		System.out.println("main");

		 NonStaticBlock obj1= new NonStaticBlock();
		 obj1.displayMessage();
		 
		 System.out.println("=============");
		 NonStaticBlock obj2= new NonStaticBlock("Hellooo...");
		 obj2.displayMessage();
	}
	
	{
		displayMessage();
		System.out.println("non-static block2");
	}

}
