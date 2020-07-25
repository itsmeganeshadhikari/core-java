package section5.looping;

import java.util.Scanner;

public class ForLoopDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any integer: ");
		int n = input.nextInt();//5
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("The sum of nth numbers is: " + sum);
	}
}
