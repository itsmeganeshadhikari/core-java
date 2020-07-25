package section4.wrapperdemo;

public class WrapperDemo4 {

	public static void main(String[] args) {
		//from primitive to object(auto-boxing)
		int n1=34;
		Integer i1=new Integer(n1);
		System.out.println(n1);
		System.out.println(i1);
		
		//from object to primitive(auto-unboxing)
		Integer i2=new Integer(23);
		int n2=i2.intValue();
		System.out.println(i2);
		System.out.println(n2);
	}
}
