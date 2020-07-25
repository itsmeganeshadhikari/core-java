package section5.conditional;

public class NestedIfElseDemo {

	public static void main(String[] args) {

		int a = 4;
		int b = 5;
		int c = 6;

		if (a > b) {
			if (a > c) {
				System.out.println("a is greatest one");
			} else {
				System.out.println("c is greatest one");
			}
		} else {
			System.out.println("a is smaller than b but c may be greater or smaller than a");
		}

	}

}
