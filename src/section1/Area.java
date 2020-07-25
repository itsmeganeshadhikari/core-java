package section1;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		final double PI = Math.PI;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter radius: ");
		double radius = input.nextDouble();
		double areaOfCircle = PI * radius * radius;
		System.out.println("Area of circle is: " + areaOfCircle);
	}
}
