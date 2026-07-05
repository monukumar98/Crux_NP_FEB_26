package Lec35;

import java.util.HashMap;
import java.util.Set;

public class HashMap_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		// add
		map.put("Raj", 56);
		map.put("Kunal", 77);
		map.put("Ankit", 89);
		map.put("Shiva", 56);
		map.put("Puneet", 78);
		map.put("Kartik", 78);
		map.put("Pooja", 36);
		map.put("Puneet", 58);
		Set<String> keyset = map.keySet();
	//	System.out.println(keyset);
		for(String key:map.keySet()) {
			System.out.println(key+" "+map.get(key));
		}
//		for(String key:keyset) {
//			System.out.println(key+" "+map.get(key));
//		}
	}

}
