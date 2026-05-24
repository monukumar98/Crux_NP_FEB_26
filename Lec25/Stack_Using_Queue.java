package Lec25;

import Lec24.DynamicQueue;

public class Stack_Using_Queue {
	private DynamicQueue dq;

	public Stack_Using_Queue() {
		// TODO Auto-generated constructor stub
		dq = new DynamicQueue();
	}

	public boolean isEmpty() {
		return dq.isEmpty();
	}

	public int size() {
		return dq.size();
	}

	// O(1)
	public void push(int item) throws Exception {
		dq.Enqueue(item);
	}
	// O(N)
	public int pop() throws Exception {
		DynamicQueue hlp = new DynamicQueue();
		while (dq.size() > 1) {
			hlp.Enqueue(dq.Dequeue());
		}
		int x = dq.Dequeue();
		while (hlp.size() > 0) {
			dq.Enqueue(hlp.Dequeue());
		}
		return x;
	}
	// O(N)
	public int peek() throws Exception {
		DynamicQueue hlp = new DynamicQueue();
		while (dq.size() > 1) {
			hlp.Enqueue(dq.Dequeue());
		}
		int x = dq.Dequeue();
		while (hlp.size() > 0) {
			dq.Enqueue(hlp.Dequeue());
		}
		dq.Enqueue(x);
		return x;
	}

}
