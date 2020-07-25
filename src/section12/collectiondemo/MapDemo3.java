package section12.collectiondemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo3 {

	public static void main(String[] args) {
		Map<Integer, String> nameList = new HashMap<>();
		nameList.put(10, "Prasil");
		nameList.put(20, "Saurabh");
		nameList.put(30, "Saraj");
		nameList.put(40, "Kshitij");

		for (Map.Entry<Integer, String> names : nameList.entrySet()) {
			System.out.println(names.getKey() + ": " + names.getValue());
		}

	}

}
