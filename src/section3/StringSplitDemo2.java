package section3;

import java.util.StringTokenizer;

public class StringSplitDemo2 {

	public static void main(String[] args) {
		String s1 = "Nepal is going to, be ruled by Bam panthi very soon, and Prachand will be Rastrapati, and Oli will PM";
		StringTokenizer st = new StringTokenizer(s1);
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

		System.out.println("=======");
		st = new StringTokenizer(s1, ",");
		while (st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}
	}

}
