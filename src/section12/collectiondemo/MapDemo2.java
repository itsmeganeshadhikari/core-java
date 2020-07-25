package section12.collectiondemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo2 {

	public static void main(String[] args) {
		Map<Integer, String> nameList= new HashMap<>();
		nameList.put(10, "Rakesh");
		nameList.put(20, "Ritika");
		nameList.put(30, "Rina");
		nameList.put(40, "Risabh");
		System.out.println(nameList);
		System.out.println(nameList.containsKey(10));
		System.out.println(nameList.containsValue("Prashil"));
		System.out.println(nameList.containsValue("Risabh"));
		System.out.println(nameList.isEmpty());
		nameList.remove(10);
		System.out.println(nameList);
//		nameList.clear();
		System.out.println(nameList);
		
		System.out.println(nameList.values());
		System.out.println(nameList.size());
		System.out.println(nameList.keySet());

	}

}
