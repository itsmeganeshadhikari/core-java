package section8.exceptiondemo;

public class ExceptionDemo7 {

	public static void main(String[] args) {
		vote(12);
		System.out.println("end");
	}

	public static void vote(int age) {
		if (age >= 18) {
			System.out.println("you can  vote...");
		} else {
			InvalidAgeException ae = new InvalidAgeException("you can not vote...");
			throw ae;
		}
	}
}
