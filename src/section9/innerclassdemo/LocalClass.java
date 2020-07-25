package section9.innerclassdemo;

public class LocalClass {

	public void greet() {
		class LocalInnerClass {
			String msg = "Hello, ";

			public String sayHello() {
				return msg;
			}
		}
		LocalInnerClass lc = new LocalInnerClass();
		System.out.println(lc.sayHello() + "good morning");
	}

	public static void main(String[] args) {
		LocalClass l = new LocalClass();
		l.greet();
	}
}
