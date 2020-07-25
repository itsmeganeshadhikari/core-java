package section6.objectdemo;

public class ObjectDemo3 {

	int a;
	
	public static void main(String[] args) {
		System.out.println(new ObjectDemo3().a);
		System.out.println(new ObjectDemo3().a);
		System.out.println(new ObjectDemo3().a);
		
		ObjectDemo3 obj= new ObjectDemo3();
		System.out.println(obj.a);
		System.out.println(obj.a);
		System.out.println(obj.a);
	}
}
