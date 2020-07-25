package section6.methoddemo;

public class MethodDemo7 {

	public static void main(String[] args) {
		int size = 2;
		int[] a1 = returnArray(size);
		MethodDemo6.printArray(a1);
		MethodDemo6.printArray(returnArray(size));
	}

	public static int[] returnArray(int size) {
		int[] arr = new int[size];
		return arr;
	}
}
