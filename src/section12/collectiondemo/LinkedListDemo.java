package section12.collectiondemo;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		List<String> l = new LinkedList<>();
		l.add("Kathmandu");
		l.add("Pokhara");
		l.add("Chitwan");
		l.add("Janakpur");
		System.out.println(l);
		l.add(2, "Poon Hill");
		System.out.println(l);
		l.set(4, "lumbini");
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
		System.out.println(l.get(1));
		System.out.println(l.indexOf("Pokhara"));
		System.out.println(l.contains("Janakpur"));
		System.out.println(l.size());
		// l.clear();
		System.out.println(l.isEmpty());

		List<String> ll = new LinkedList<>();
		ll.add("Biratnagar");
		System.out.println(ll);
		// ll.addAll(l);
		ll.addAll(0, l);
		System.out.println(ll);

		System.out.println(ll.containsAll(l));
		// ll.removeAll(l);
		ll.retainAll(l);
		System.out.println(ll);
	}

}
