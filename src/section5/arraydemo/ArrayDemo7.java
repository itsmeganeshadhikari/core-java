package section5.arraydemo;

import java.util.Scanner;

public class ArrayDemo7 {

	public static void main(String[] args) {

		final int ROW = 3;
		final int COLUMN = 3;
		int[][] arr = new int[ROW][COLUMN];
		Scanner sc = new Scanner(System.in);
		// to take input in an array
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COLUMN; j++) {
				System.out.println("Enter: ");
				arr[i][j] = sc.nextInt();
			}
		}
		// to print the array
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COLUMN; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
