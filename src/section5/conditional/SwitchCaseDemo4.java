package section5.conditional;

import java.util.Scanner;

public class SwitchCaseDemo4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter choice: ");
		int choice = input.nextInt();
		switch(choice) {
		
		case 1: System.out.println("Addition");
		break;
		
		case 2: System.out.println("Sub");
		break;
		
		case 3: System.out.println("Multi");
		
		
		case 4: System.out.println("Div");
		break;
		
		default:
			System.out.println("Wrong choice");
		
	
		}
		System.out.println("end");
	}

}
