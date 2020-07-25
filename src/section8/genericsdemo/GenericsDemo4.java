package section8.genericsdemo;

import java.util.HashMap;
import java.util.Map;

public class GenericsDemo4 {

	public static void main(String[] args) {

		Map<Integer, String> m = new HashMap<>();

		Pair<String, String> p1 = new OrderedPair<>("firstName", "Santosh");
		System.out.println(p1.getKey() + " " + p1.getValue());
		
		Pair<Integer, String> p2 = new OrderedPair<>(10, "Ganesh");
		System.out.println(p2.getKey() + " " + p2.getValue());
	}

}
