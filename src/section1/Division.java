package section1;

import java.util.Scanner;

public class Division {
	
	public static void main(String[] args) {
		//This is single line comments
		//taking input from console(user)
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a: ");
		double a = input.nextDouble();
		System.out.println("Enter b: ");
		double b = input.nextDouble();
		double div = a / b;
		System.out.println("The division of " + a + " and " + b + " is: " + div);

	}

}
