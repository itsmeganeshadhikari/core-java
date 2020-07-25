package section5.arraydemo;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// <data type> [] <array name>= new <data type>[size of array];
		// valid declaration
		// int arr1[] = new int[3];
		// int[] arr2;
		// arr2 = new int[3];
		// int arr3[];
		// arr3 = new int[3];

		// Invalid declaration
		// int [] ar= new int[];
		// int [3] arrr= new int[];

		int[] arr = new int[3];
		System.out.println(arr);
		System.out.println(arr.length);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		// System.out.println(arr[3]);//It gives ArrayIndexOutOfBoundsException
	}
}
