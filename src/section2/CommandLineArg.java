package section2;

public class CommandLineArg {

	public static void main(String[] args) {
		// String[] names = { "Ram", "30", "3.4" };
		printNames(args);
		
	}

	public static void printNames(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
}
