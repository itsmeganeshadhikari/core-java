package section8.exceptiondemo;

public class ErrorDemo {

	public static void main(String[] args) {
		try {
			System.out.println("try start");
			long[] arr = new long[1000000000];
			System.out.println("try end");

		} catch (Exception e) {
			System.out.println("catch block");
		}
		System.out.println("end of program");
	}
}
