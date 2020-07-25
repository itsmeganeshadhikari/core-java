package section3;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Good");
		System.out.println(sb);
		sb.append(" Morning");
		System.out.println(sb);
		sb.insert(12, "s");
		System.out.println(sb);
		sb.delete(4, 13);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);

	}

}
