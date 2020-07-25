package section6.constructordemo;

public class Student {
	

	String name;
	int roll;

	public void printInfo() {
		System.out.println(name);
		System.out.println(roll);
	}
	
	public Student(String n, int r) {
		name = n;
		roll = r;
		System.out.println();
		
	}
	
//	public void assignValue(String n, int r) {
//		name = n;
//		roll = r;
//		
//	}
	
	public static void main(String[] args) {
		Student student = new Student("Rakesh",10);
		//student.assignValue("Rakesh", 10);
		student.printInfo();
		
		System.out.println("================");
		Student student1 = new Student("Ram",190);
		//student.assignValue("Rakesh", 10);
		student1.printInfo();
		
	}
}
