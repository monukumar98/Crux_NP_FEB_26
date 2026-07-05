package Lec35;

import java.util.*;

public class Set_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>();
		set.add(10);
		set.add(2);
		set.add(31);
		set.add(7);
		set.add(-9);
		set.add(10);
		System.out.println(set);
//		// contains
//		System.out.println(set.contains(11));
//		System.out.println(set.contains(10));
//		// remove
//		System.out.println(set.remove(10));
//		System.out.println(set.contains(11));
//		System.out.println(set);
		TreeSet<Integer> set1 = new TreeSet<>();
		set1.add(10);
		set1.add(2);
		set1.add(31);
		set1.add(7);
		set1.add(-9);
		set1.add(10);
		System.out.println(set1);
		LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
		set2.add(10);
		set2.add(2);
		set2.add(31);
		set2.add(7);
		set2.add(-9);
		set2.add(10);
		System.out.println(set2);
		
		for(int x:set) {
			System.out.print(x+" ");
		}
		System.out.println();

	}

}

















