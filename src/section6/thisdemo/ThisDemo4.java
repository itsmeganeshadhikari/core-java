package section6.thisdemo;

public class ThisDemo4 {

	public String sayHello() {
		return "hello....";
	}

	public static String welcome(ThisDemo4 obj) {
		return obj.sayHello() + " , Welcome to Java World!!!";
	}

	public void greet() {
		System.out.println(welcome(this));
	}

	public static void main(String[] args) {
		ThisDemo4 obj = new ThisDemo4();
		obj.greet();
	}

}
