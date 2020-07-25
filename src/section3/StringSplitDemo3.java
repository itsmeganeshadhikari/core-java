package section3;

import java.util.StringTokenizer;

public class StringSplitDemo3 {

	public static void main(String[] args) {
		String s1 = "Nepal is,, going to,, be ruled by Bam panthi very soon,, and Prachand will,, be Rastrapati, and Oli will PM";
		String[] words = s1.split(",");
		System.out.println(words.length);
		for (String word : words) {
			System.out.println(word);
		}

		System.out.println("======");
		StringTokenizer st = new StringTokenizer(s1,",");
		System.out.println(st.countTokens());
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
