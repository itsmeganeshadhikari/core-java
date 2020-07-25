package section3;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Good");
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
