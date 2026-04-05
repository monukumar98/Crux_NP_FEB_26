package Lec14;

import java.util.ArrayList;

public class Arrays_List_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(5);
		ll.add(2, -9);
		for (int i = 0; i < ll.size(); i++) {
			System.out.print(ll.get(i) + " ");
		}
		System.out.println();
		int[] arr = new int[6];
		
		for(int x:ll) {
			System.out.print(x+" ");
		}
		System.out.println();
        for(int x :arr) {
        	System.out.print(x+" ");
		}
	}

}
