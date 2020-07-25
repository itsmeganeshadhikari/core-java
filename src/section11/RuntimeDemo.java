package section11;

import java.io.IOException;

public class RuntimeDemo {

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		System.out.println("Free "+rt.freeMemory() / (1024 * 1024));
		System.out.println("Max "+rt.maxMemory() / (1024 * 1024));
		System.out.println("Total "+rt.totalMemory() / (1024 * 1024));
		System.out.println(rt.availableProcessors());

		// try {
		// rt.exec("calc.exe");
		// // rt.exec("notepad.exe");
		// // rt.exec("D:\\eclipse\\eclipse-oxygen\\eclipse.exe");
		// } catch (IOException e) {
		// e.printStackTrace();
		// }

	}

}
