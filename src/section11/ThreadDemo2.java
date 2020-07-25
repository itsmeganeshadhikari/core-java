package section11;

public class ThreadDemo2 implements Runnable{

	@Override
	public void run() {
		System.out.println("hello from thread");
	}
	
	public static void main(String[] args) {
		ThreadDemo2 t=new ThreadDemo2();
		Thread tt= new Thread(t);
		tt.run();
	}

}
