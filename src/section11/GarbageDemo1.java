package section11;

public class GarbageDemo1 {

	public static void main(String[] args) {

		Runtime rt = Runtime.getRuntime();

		System.out.println(rt.freeMemory() / (1024 * 1024));
		for (int i = 1; i <= 100000000; i++) {
			 new GarbageDemo1();
		}
		System.out.println(rt.freeMemory() / (1024 * 1024));
		
		rt.gc();
		System.out.println(rt.freeMemory() / (1024 * 1024));
		
	}

}
