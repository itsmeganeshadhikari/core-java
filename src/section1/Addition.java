package section1;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a = input.nextInt();
		System.out.println("Enter b: ");
		int b = input.nextInt();
		int sum = a + b;
		System.out.println("The sum is: " + sum);
		System.out.println("The sum of a and b is: " + sum);
		System.out.println("The sum of " + a + " and " + b + " is: " + sum);

	}

}
