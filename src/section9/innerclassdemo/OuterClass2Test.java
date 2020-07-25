package section9.innerclassdemo;

public class OuterClass2Test {
	public static void main(String[] args) {
		System.out.println(OuterClass2.outerVar);
		OuterClass2.outerMethod();
		System.out.println(OuterClass2.StaticInnerClass.innerVar);
		OuterClass2.StaticInnerClass.innerMethod();
	}
}
