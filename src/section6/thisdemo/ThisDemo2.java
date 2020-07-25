package section6.thisdemo;

public class ThisDemo2 {

	String name;
	int age;

	// public ThisDemo2(String n, int a) {
	// name = n;
	// age = a;
	// }

	// public ThisDemo2(String name, int age) {
	// name = name;
	// age = age;
	// }

	// public ThisDemo2(String name, int age) {
	// this.name = name;
	// this.age = age;
	// }

	public ThisDemo2(int age, String name) {
		name = this.name;
		age = this.age;
	}

	public void printInfo() {
		System.out.println(name + " " + age);
	}

	public static void main(String[] args) {
		ThisDemo2 obj = new ThisDemo2(22, "Ram");
		obj.printInfo();
	}

}
