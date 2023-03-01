package in.co.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set; 

public class HASHMAPTEST {
	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		map.put(null, "zero"); //null key
		map.put("1", "one");
		map.put("2", "two");
		map.put("3", "three");
		System.out.println(map);
		
		// get a value
		String str = (String) map.get("1");
		System.out.println(str);
		
		// remove an element by key
		map.remove("3");
		System.out.println(map);
		
		// get collection of keys and prints
		Set keys = map.keySet();
		for (Object k : keys) {
			System.out.println("by collection: " +k);
			
			//print all key and value pairs
			Set keyValue = map.entrySet();
			for (Object ele : keyValue) {
				Map.Entry pair = (Map.Entry) ele;
				System.out.println(pair.getKey()+ " "+ pair.getValue());
			}
			
			
		}
	
		
		
		
		
	}

}