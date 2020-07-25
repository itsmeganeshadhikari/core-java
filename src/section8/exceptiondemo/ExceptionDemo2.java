package section8.exceptiondemo;

import java.util.Scanner;

//try-catch-finally demo
public class ExceptionDemo2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a = in.nextInt();
		System.out.println("Enter b: ");
		int b = in.nextInt();

		try {
			System.out.println("try block start");
			int div = divide(a, b);
			System.out.println("The division is: " + div);
			System.out.println("try block end");
		} catch (ArithmeticException ae) {
			System.out.println("catch block");
		}finally {
			//finally always runs
			System.out.println("finally block");
			in.close();
		}

		System.out.println("End of program....");
	}

	public static int divide(int a, int b) {
		return a / b;
	}
}
