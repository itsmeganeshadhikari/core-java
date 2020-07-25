package section11;

public class ThreadDemo5 extends Thread {

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {

		ThreadDemo5 t1 = new ThreadDemo5();
		ThreadDemo5 t2 = new ThreadDemo5();
		ThreadDemo5 t3 = new ThreadDemo5();

		t1.start();
		// t1.join();
		t1.join(1000);
		t2.start();
		t3.start();
	}

}
