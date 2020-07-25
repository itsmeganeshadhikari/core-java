package section6.thisdemo;

public class CopyConstructor {
	String name;
	int age;

	public CopyConstructor(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public CopyConstructor(CopyConstructor o) {
		this(o.name, o.age);
	}

	public void printInfo() {
		System.out.println(name + " " + age);
	}

	public static void main(String[] args) {
		CopyConstructor obj = new CopyConstructor(new CopyConstructor("Ram", 22));
		obj.printInfo();
	}

}
