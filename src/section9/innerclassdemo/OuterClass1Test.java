package section9.innerclassdemo;

import section9.innerclassdemo.OuterClass1.NonStaticInnerClass;

public class OuterClass1Test {
	public static void main(String[] args) {

		OuterClass1 outerObj = new OuterClass1();

		NonStaticInnerClass innerObj = outerObj.new NonStaticInnerClass();
		System.out.println(innerObj.innerVar);
		innerObj.innerMethod();

	}
}
