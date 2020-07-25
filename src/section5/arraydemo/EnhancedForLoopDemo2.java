package section5.arraydemo;

public class EnhancedForLoopDemo2 {
	public static void main(String[] args) {
		int[][] arr = { { 2, 3, 6 }, { 4, 5, 7 }, { 6, 7, 9 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("=====");
		for(int [] ar:arr) {
			for(int a: ar) {
				System.out.print(a+" ");
			}
			System.out.println();
		}
	}
}
