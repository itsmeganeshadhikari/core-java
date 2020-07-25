package section6.methoddemo;

public class MethodDemo8 {

	public static void main(String... args) {

		int m=findMaxElementOfArray(5, 3, 7, 8,10);
		System.out.println(m);
	}

	//variable arguments(var args)
	public static int findMaxElementOfArray(int... arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}
