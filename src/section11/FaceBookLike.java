package section11;

public class FaceBookLike {

	private int likes;

	public FaceBookLike(int likes) {
		this.likes = likes;
	}

	public synchronized void plusOne() {
		try {
			likes++;
			Thread.sleep(500);
			System.out.println(likes);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
