package section5.arraydemo;

public class EnhancedForLoopDemo1 {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("================");
		for (int a : arr) {
			System.out.println(a);
		}

	}

}
