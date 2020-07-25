package section5.arraydemo;

public class ArrayDemo10 {

	public static void main(String[] args) {
		int[][] arr = new int[3][];// jagged array
		
		arr[0]=new int[1];
		arr[0][0]=1;
		
		arr[1]=new int[2];
		arr[1][0]=1;
		arr[1][1]=2;
		
		
		arr[2]=new int[3];
		arr[2][0]=1;
		arr[2][1]=2;
		arr[2][2]=3;
		
		for (int[] ar : arr) {
			for(int a: ar) {
				System.out.print(a+" ");
			}
			System.out.println();
		}

		System.out.println("==============");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
