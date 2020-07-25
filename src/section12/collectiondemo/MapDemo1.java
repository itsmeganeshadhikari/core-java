package section12.collectiondemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {

	public static void main(String[] args) {
		Map<Integer, String> nameList = new HashMap<>();
		nameList.put(100, "Ganesh");
		nameList.put(200, "Narendra");
		nameList.put(300, "Arun");
		nameList.put(400, "Kshitij");
		System.out.println(nameList);
		
		System.out.println(nameList.get(100));
		System.out.println(nameList.get(200));
		System.out.println(nameList.get(300));
		System.out.println(nameList.get(400));
	}
}
