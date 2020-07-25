package section4.librarydemo;

public class MathDemo {

	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.E);
		System.out.println(Math.exp(2));
		System.out.println(Math.log(1));
		double radians = Math.toRadians(45);
		System.out.println(Math.tan(radians));
		System.out.println(Math.abs(-3423));
		System.out.println(Math.ceil(43.45));
		System.out.println(Math.floor(43.45));
		System.out.println(Math.round(43.55));

		for (int i = 1; i <= 5; i++) {
			System.out.println((int)Math.random()*10);
		}

	}

}
