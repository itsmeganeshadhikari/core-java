package section12.collectiondemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo1 {

	public static void main(String[] args) {
		Set<Integer> s = new HashSet<>();
		s.add(40);
		s.add(50);
		s.add(40);
		s.add(60);
		// s.add(1, 70);
		// s.set(1, 80);
		// s.get(2);
		System.out.println(s);
		for (Integer a : s) {
			System.out.println(a);
		}
		System.out.println("============");
		Iterator<Integer> it = s.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
