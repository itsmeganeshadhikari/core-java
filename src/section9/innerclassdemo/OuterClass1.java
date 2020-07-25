package section9.innerclassdemo;

public class OuterClass1 {

	int outerVar;

	public void outerMethod() {

	}

	class NonStaticInnerClass {
		int innerVar;

		public void innerMethod() {

		}
	}

	public static void main(String[] args) {
		OuterClass1 outerObj = new OuterClass1();

		NonStaticInnerClass innerObj = outerObj.new NonStaticInnerClass();
		System.out.println(innerObj.innerVar);
		innerObj.innerMethod();

	}
}
