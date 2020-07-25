package section8.genericsdemo;

public class GenericsDemo2 {

	public static void main(String[] args) {

		printArray(new Integer[] { 10, 20, 30, 40 });
		System.out.println("================");

		printArray(new String[] { "Ram", "Ganesh", "Hari" });
		System.out.println("================");

		printArray(new Double[] { 1.2, 2.3, 4.3 });
	}

	public static <E> void printArray(E[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
