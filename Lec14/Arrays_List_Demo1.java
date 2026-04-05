package Lec14;

import java.util.ArrayList;
import java.util.Collections;

public class Arrays_List_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();
		System.out.println(ll);
		// add
		ll.add(10);// O(1)
		ll.add(20);
		ll.add(30);
		ll.add(5);
		ll.add(2, -9);// index, value O(N)
		System.out.println(ll);
		// get
		System.out.println(ll.get(1));// O(1)
		// remove
		System.out.println(ll.remove(1));// O(N)
		System.out.println(ll);
		// update
		ll.set(2, 7);// O(1)
		System.out.println(ll.size());
		Collections.sort(ll);// O(N(log(N))
		System.out.println(ll);

	}

}
