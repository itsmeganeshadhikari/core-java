package section6.methoddemo;

public class MethodDemo6 {

	public static void main(String[] args) {

		int[] a = { 2, 5, 6 };
		printArray(a);

	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
