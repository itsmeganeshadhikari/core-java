package section6.methoddemo;

public class MethodDemo5 {

	public static MethodDemo5 returnObject() {
		// return null;
		// return new MethodDemo5();
		MethodDemo5 obj = new MethodDemo5();
		return obj;
	}

	public void sayHi() {
		System.out.println("hiiiii...");
	}

	public static void main(String[] args) {
		returnObject().sayHi();
	}

}
