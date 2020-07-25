package section2;

import java.util.Scanner;

public class InputDemo1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter name: ");
		// String name=input.nextLine();
		String name = input.next();
		System.out.println("Your name is: " + name);
		System.out.println("Enter any characters: ");
		char c = input.next().charAt(0);
		System.out.println("Entered cahracter is: " + c);

	}

}
