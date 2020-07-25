package section6.objectdemo;

public class DefaultValueDemo {
	
	String n;
	static int a; 
	double d;
	static long l;
	boolean b;
	char c;
	DefaultValueDemo o;
	static DefaultValueDemo dv;

	public static void main(String[] args) {
		//Default value demo
		System.out.println("Non static calling");
		DefaultValueDemo obj = new DefaultValueDemo();
		System.out.println(obj.n);
		System.out.println(obj.d);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.o);
		
		System.out.println("===================");
		System.out.println("Static calling");
		System.out.println(a);
		System.out.println(dv);
		System.out.println(l);
		
//		//Local variable has no default value
//		String a;
//		System.out.println(a);
	}

}
