package section3;

public class StringImmutabilityDemo {

	public static void main(String[] args) {
		String s1="Good";
		System.out.println(s1);
		s1=s1.concat(" Morning");
		System.out.println(s1);
	}

}
