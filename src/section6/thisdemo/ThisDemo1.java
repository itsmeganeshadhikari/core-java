package section6.thisdemo;

//1.Shadowing: is the process of hiding the instance variable by local
//variable inside non-static method and constructor of a class
//2.this: is a keyword and is an implicit reference variable of current type
//and current object and is available inside non-static method and constructor
//of a class.We can not change the value of 'this' because it is a final variable

public class ThisDemo1 {

	// instance variable
	int a = 5;

	public void print() {
		System.out.println("this is: " + this);
		System.out.println(a);// this.a
		System.out.println(this.a);
		// local variable
		int a = 4;
		System.out.println(a);
		System.out.println(this.a);
		int sum = a + this.a;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		ThisDemo1 obj1 = new ThisDemo1();
		System.out.println("obj1 is: " + obj1);
		obj1.print();
		System.out.println("==============");
		ThisDemo1 obj2 = new ThisDemo1();
		System.out.println("obj2 is: " + obj2);
		obj2.print();

	}

}
