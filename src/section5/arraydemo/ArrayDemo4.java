package section5.arraydemo;

public class ArrayDemo4 {

	public static void main(String[] args) {
		int[] arr = { 8, 4, 9, 5, 6 };

		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Max element of an array is: " + max);
	}

}
