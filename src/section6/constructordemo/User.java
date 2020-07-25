package section6.constructordemo;

public class User {

	String name;
	int age;
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(age);
	}
	
	public User() {
		System.out.println("Default constructor");
	}
	
	public User(String n, int a) {
		name = n;
		age = a;
		System.out.println("Parameterized/Argumented Constructor");
	}
	
	public static void main(String[] args) {
		User user = new User();
		user.printInfo();
		
		User user1 = new User("Rakesh",10);
		user1.printInfo();
		
	}

}
