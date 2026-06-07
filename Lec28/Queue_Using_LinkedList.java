package Lec28;

import java.util.*;

public class Queue_Using_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(10);// add last
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		System.out.println(ll);
		System.out.println(ll.remove());// remove first
		
		Queue<Integer> q = new LinkedList<>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		System.out.println(q);
		System.out.println(q.remove());// removefirst
		System.out.println(q.poll());// removefirst
		System.out.println(q);
		System.out.println(q.peek());// view 
		System.out.println(q);

	}

}
