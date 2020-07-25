package section3;

public class StringSplitDemo {

	public static void main(String[] args) {
		String s1 = "Nepal is going to, be ruled by Bam panthi very soon, and Prachand will be Rastrapati, and Oli will PM";
		String[] words = s1.split(" ");
		for (String word : words) {
			System.out.println(word);
		}
		System.out.println("=======");
		words = s1.split(",");
		for (String word : words) {
			System.out.println(word);
		}

	}

}
