package section5.conditional;

public class ElseIfDemo {

	public static void main(String[] args) {

		int marks = 58;
		if (marks < 0 || marks >= 101) {
			System.out.println("Invalid marks");
		} else if (marks > 79 && marks <= 100) {
			System.out.println("Distinction");

		}else if (marks > 59 && marks <= 79) {
			System.out.println("First");

		}else if (marks > 39 && marks <= 59) {
			System.out.println("second");

		}else {
			System.out.println("fail");
		}
	}

}
