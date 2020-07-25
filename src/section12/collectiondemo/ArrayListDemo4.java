package section12.collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo4 {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		System.out.println(al);
		System.out.println("1.=======");
		int sum = 0;
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
			int e = al.get(i);
			if (e == 30) {
				break;
			}
			sum = sum +e;
		}
		System.out.println(sum);
		System.out.println("2.==========");
		for (Integer a : al) {
			System.out.println(a);
		}
		System.out.println("3.============");
		Iterator<Integer> it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("4.============");
		ListIterator<Integer> lit = al.listIterator();
		while (lit.hasNext()) {
			System.out.println(lit.next());
		}
		System.out.println();
		while (lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
	}

}
