package section12.collectiondemo;

import java.util.Arrays;
import java.util.List;

public class ArraysDemo {

	public static void main(String[] args) {
		int[] arr = { 4, 2, 3, 5, 7 };
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.binarySearch(arr, 3));
		int[] ar = Arrays.copyOf(arr, 7);
		System.out.println(Arrays.toString(ar));
		Integer[] arrr = { 4, 2, 3, 5, 7 };
		List<Integer> l = Arrays.asList(arrr);
		System.out.println(l);
	}

}
