package section8.exceptiondemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionExample {
	int a = 4;

	public static void main(String[] args) {
		// 1.Few examples of Run time exception(unchecked exception)
		// 1.It gives ArithmeticException
		// int div = 4 / 0;
		// System.out.println(div);
		// 2.It give ArrayIndexOutOfBoundsException
		int[] arr = { 4, 5, 6 };
		// for (int i = 0; i <= arr.length; i++) {
		// System.out.println(arr[i]);
		// }
		// 3.It gives NumberFormatException
		// String a="4.3";
		// int i=Integer.parseInt(a);
		// System.out.println(i);
		// 4.It gives InputMismatchException if
		// int value is not passed
		// System.out.println("Enter any int value: ");
		// int x = new Scanner(System.in).nextInt();
		// System.out.println(x);
		// // 5.It gives NullPointerException
		// ExceptionExample e = null;
		// System.out.println(e.a);

		// 1.an example of Compile exception(checked exception)
		// from date to string
		Date currentDate = new Date();
		System.out.println(currentDate);

		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm a MM/dd/yyyy");
		String d = dateFormat.format(currentDate);
		System.out.println(d);

		// from String to date
		String date = "2011-01-11";
		dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		// Date dd=dateFormat.parse(date);
		// System.out.println(dd);

	}

}
