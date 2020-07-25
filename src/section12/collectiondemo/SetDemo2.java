package section12.collectiondemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo2 {

	public static void main(String[] args) {
		Set<Integer> hs = new HashSet<>();
		hs.add(40);
		hs.add(60);
		hs.add(50);
		hs.add(40);
		
		System.out.println("hash set is: " + hs);
		
		Set<Integer> lhs = new LinkedHashSet<>();
		lhs.add(40);
		lhs.add(60);
		lhs.add(50);
		lhs.add(40);
		System.out.println("linked hash set is: " + lhs);
		
		Set<Integer> ts = new TreeSet<>();
		ts.add(40);
		ts.add(60);
		ts.add(50);
		ts.add(40);
		System.out.println("tree set is: " + ts);
	}
}
