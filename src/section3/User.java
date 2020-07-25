package section3;

public class User {

	private String name;

	public User(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

	public static void main(String[] args) {
		String s = new String("hello");
		System.out.println(s);

		User u = new User("hello");
		System.out.println(u);
		System.out.println(u.toString());
	}
}
