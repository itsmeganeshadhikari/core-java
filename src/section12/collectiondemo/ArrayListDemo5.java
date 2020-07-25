package section12.collectiondemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListDemo5 {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		al.add(20);
		al.add(10);
		al.add(30);
		al.add(40);
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);
		System.out.println(Collections.binarySearch(al, 50));
		Collections.reverse(al);
		System.out.println(al);
		Collections.shuffle(al);
		System.out.println(al);
		al.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 > o2) {
					return 1;
				}
				return -1;
			}
		});
		System.out.println(al);
		al.add(50);
		System.out.println(al);
		List<Integer> ul=Collections.unmodifiableList(al);
		System.out.println(ul);
//		ul.add(70);
		
	}
}
