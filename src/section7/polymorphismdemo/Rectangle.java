package section7.polymorphismdemo;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Rectangle is drawn using four points...");
	}

}
