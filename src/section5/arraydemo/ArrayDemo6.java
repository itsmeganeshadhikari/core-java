package section5.arraydemo;

public class ArrayDemo6 {
	public static void main(String[] args) {
		final int ROW = 3;
		final int COLUMN = 3;
		int[][] arr = new int[ROW][COLUMN];
		arr[0][0] = 2;
		arr[0][1] = 3;
		arr[0][2] = 7;
		arr[1][0] = 2;
		arr[1][1] = 8;
		arr[1][2] = 6;
		arr[2][0] = 9;
		arr[2][1] = 5;
		arr[2][2] = 4;

		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COLUMN; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
