package section6.objectdemo;

public class ObjectDemo2 {

	public static void main(String[] args) {
		System.out.println(new ObjectDemo2());
		
		ObjectDemo2 obj1= new ObjectDemo2();
		System.out.println(obj1);
		
		ObjectDemo2 obj2=null;
		System.out.println(obj2);
		
		obj2=new ObjectDemo2();
		System.out.println(obj2);
		
		System.out.println("section6.objectdemo.ObjectDemo2@"+Integer.toHexString(2018699554));

	}

}
