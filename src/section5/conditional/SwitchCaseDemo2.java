package section5.conditional;

import java.util.Scanner;

public class SwitchCaseDemo2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter choice: ");
		char choice = input.next().charAt(0);
		switch(choice) {
		
		case '+': System.out.println("Addition");
		break;
		
		case '-': System.out.println("Sub");
		break;
		
		case '*': System.out.println("Multi");
		break;
		
		case '/': System.out.println("Div");
		break;
		
		default:
			System.out.println("Wrong choice");
		
	
		}
		System.out.println("end");
	}

}
