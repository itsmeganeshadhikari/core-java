package section5.conditional;

import java.util.Scanner;

public class SwitchCaseDemo3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter choice: ");
		String choice = input.nextLine();
		switch(choice) {
		
		case "add": System.out.println("Addition");
		break;
		
		case "sub": System.out.println("Sub");
		break;
		
		case "multi": System.out.println("Multi");
		break;
		
		case "div": System.out.println("Div");
		break;
		
		default:
			System.out.println("Wrong choice");
		
	
		}
		System.out.println("end");
	}

}
