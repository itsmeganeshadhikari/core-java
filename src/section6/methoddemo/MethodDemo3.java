package section6.methoddemo;

public class MethodDemo3 {

	// <access modifier> <return type> <method name>(){
	// //do something
	// return suitable value
	// }

	// return method with zero arguments
	public static String sayHello() {
		String msg = "Hellloooo....";
		return msg;
		// return "Hellloooo....";
	}

	// <access modifier> <return type> <method name>(args if any){
	// //do something
	// return suitable value
	// }
	
	// return method with any type and any numbers of arguments
	public static int findMax(int a, int b) {
		int max = 0;
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		return max;
	}

	public static void main(String[] args) {
		String m = sayHello();
		System.out.println(m);

		int max = findMax(2, 3);
		System.out.println("Max number is: " + max);
	}

}
