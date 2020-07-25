package section11;

public class ThreadDemo1 extends Thread {

	public void run() {
		System.out.println("Hello from thread...");
	}

	public static void main(String[] args) {

		ThreadDemo1 t1 = new ThreadDemo1();
		t1.start();
	}
}
