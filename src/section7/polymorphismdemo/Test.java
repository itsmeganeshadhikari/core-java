package section7.polymorphismdemo;

import java.util.Scanner;

//An example of run time polymorphism(dynamic binding)
//which is achieved by overriding of methods
public class Test {

	public static void main(String[] args) {
		Shape shape = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Choice: ");
		String choice = sc.next();
		switch (choice) {
		case "triangle":
			shape = new Triangle();
			break;
		case "rectangle":
			shape = new Rectangle();
			break;
		default:
			System.out.println("Wrong choice...");
		}

		if (shape != null) {
			shape.draw();
		}
	}

}
