package section8.exceptiondemo;

import java.util.InputMismatchException;
import java.util.Scanner;

//try with multiple catch demo(java 1.7 feature)
public class ExceptionDemo4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int[] arr = new int[2];

		try {
			System.out.println("Enter a: ");
			int a = in.nextInt();
			System.out.println("Enter b: ");
			int b = in.nextInt();
			arr[2] = divide(a, b);
		} catch (ArithmeticException | InputMismatchException ae) {
			ae.printStackTrace();
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("End of program....");
	}

	public static int divide(int a, int b) {
		return a / b;
	}
}
