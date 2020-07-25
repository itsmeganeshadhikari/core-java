package section5.arraydemo;

import java.util.Scanner;

public class ArrayDemo3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int size = input.nextInt();
		double[] arr = new double[size];
		// to take input in an array
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter " + i + "th elements: ");
			arr[i] = input.nextDouble();
		}

		// to traverse(print) an array of element
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			sum = sum + arr[i];
		}
		System.out.println("The sum of an array elements is: "+sum);

	}

}
