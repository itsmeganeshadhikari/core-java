package section12.instanceofdemo;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Animal animal = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter choice: ");
		String choice = sc.next();

		switch (choice) {
		case "tiger":
			animal = new Tiger();
			break;
		case "dog":
			animal = new Dog();
			break;
		default:
			System.out.println("Wrong choice..");
		}

		if (animal != null) {
			new AnimalBehaviour().getAnimalBehaviour(animal);
		}

	}
}
