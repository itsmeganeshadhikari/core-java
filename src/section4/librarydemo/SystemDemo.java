package section4.librarydemo;

import java.util.Properties;

public class SystemDemo {

	public static void main(String[] args) {
		System.err.println("This is an error");
		System.out.print("hello");
		System.out.println(", welcome to java progrramming..");
		System.out.append("helllooo...");
		System.out.append(", welcome to java progrramming..");
		System.out.printf("%d", 5);
//		System.exit(0);

		Properties p = System.getProperties();
		p.list(System.out);
	}

}
