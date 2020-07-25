package section12.collectiondemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		List<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		System.out.println(al);
		al.add(30);
		System.out.println(al);
		al.add(1, 15);
		System.out.println(al);
		al.remove(3);
		System.out.println(al);
		int x=45;
		al.add(x);
		System.out.println(al);
	}

}
