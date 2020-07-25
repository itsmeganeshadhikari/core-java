package section11;

public class GarbageDemo extends Object {
	
	 protected void finalize() {
		 
		 System.out.println("finalize called");
	 }

	public static void main(String[] args) {
		
		GarbageDemo o1=new GarbageDemo();
		GarbageDemo o2=new GarbageDemo();
		GarbageDemo o3=new GarbageDemo();
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o3);
		o1=null;
		o2=null;
		o3=null;
		System.out.println(o1);
		
		System.gc();
		
		
	}

}
