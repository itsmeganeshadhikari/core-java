package section6.encapsulationdemo;

public class StudentTest {

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.setName("Rakesh");
		System.out.println(student1.getName());
		
		student1.setRoll(10);
		System.out.println(student1.getRoll());
	}

}
