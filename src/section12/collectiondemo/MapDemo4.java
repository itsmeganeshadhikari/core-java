package section12.collectiondemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo4 {

	public static void main(String[] args) {
		Map<Integer, String> nameList = new HashMap<>();
		nameList.put(40, "Kshitij");
		nameList.put(10, "Prasil");
		nameList.put(30, "Saraj");
		nameList.put(20, "Saurabh");
		

		System.out.println("hash map is: ");
		for (Map.Entry<Integer, String> names : nameList.entrySet()) {
			System.out.println(names.getKey() + ": " + names.getValue());
		}

		Map<Integer, String> nameList2 = new LinkedHashMap<>();
		nameList2.put(40, "Kshitij");
		nameList2.put(10, "Prasil");
		nameList2.put(30, "Saraj");
		nameList2.put(20, "Saurabh");
		

		System.out.println("linked hash map is: ");
		for (Map.Entry<Integer, String> names : nameList2.entrySet()) {
			System.out.println(names.getKey() + ": " + names.getValue());
		}

		Map<Integer, String> nameList3 = new TreeMap<>();
		nameList3.put(40, "Kshitij");
		nameList3.put(10, "Prasil");
		nameList3.put(30, "Saraj");
		nameList3.put(20, "Saurabh");

		System.out.println("tree map is: ");
		for (Map.Entry<Integer, String> names : nameList3.entrySet()) {
			System.out.println(names.getKey() + ": " + names.getValue());
		}

	}

}
