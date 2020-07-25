package section4.wrapperdemo;

import java.util.ArrayList;
import java.util.List;

public class WrapperDemo1 {

	public static void main(String[] args) {
		// 1.In Data Structure programming
		List<Integer> l = new ArrayList<>();
		l.add(new Integer(10));
		l.add(20);
		l.add(30);
		System.out.println(l);
		
		Integer n1=20;
		Integer n2=30;
		
		int s=sum(n1, n2);
		System.out.println("sum is: "+s);
	}

	public static Integer sum(int n1, int n2) {
		int add = n1 + n2;
		return add;
	}
}
