package Lec35;

import java.util.*;

public class HashMap_Demo {

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
//	//	map.put(null, 58);
		System.out.println(map);
//		// get
//		System.out.println(map.get("Rajesh"));
//		System.out.println(map.get("Raj"));
//		// containsKey
//		System.out.println(map.containsKey("Rajesh"));
//		System.out.println(map.containsKey("Raj"));
//		// remove
//		System.out.println(map.remove("Rajesh"));
//		System.out.println(map.remove("Raj"));
//		System.out.println(map);
		TreeMap<String, Integer> map1 = new TreeMap<>();
		// add
		map1.put("Raj", 56);
		map1.put("Kunal", 77);
		map1.put("Ankit", 89);
		map1.put("Shiva", 56);
		map1.put("Puneet", 78);
		map1.put("Kartik", 78);
		map1.put("Pooja", 36);
		map1.put("Puneet", 58);
		System.out.println(map1);
		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
		// add
		map2.put("Raj", 56);
		map2.put("Kunal", 77);
		map2.put("Ankit", 89);
		map2.put("Shiva", 56);
		map2.put("Puneet", 78);
		map2.put("Kartik", 78);
		map2.put("Pooja", 36);
		map2.put("Puneet", 58);
		System.out.println(map2);

	}

}
