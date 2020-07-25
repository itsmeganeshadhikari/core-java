package section6.objectdemo;

public class ObjectDemo5 {

	public static void main(String[] args) {

		// An object can be referenced by multiple reference variable
		// simultaneously
		ObjectDemo5 obj1 = new ObjectDemo5();// int a=5;
		ObjectDemo5 obj2 = obj1;// int b=a;
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println("============");
		// A reference variable can refer multiple object
		// but different-different time
		obj1 = new ObjectDemo5();// a=6;
		System.out.println(obj1);
		System.out.println(obj2);

	}

}
