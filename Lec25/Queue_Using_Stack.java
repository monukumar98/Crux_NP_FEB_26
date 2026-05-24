package Lec25;

import java.util.Stack;

public class Queue_Using_Stack {

	private Stack<Integer> st;

	public Queue_Using_Stack() {
		// TODO Auto-generated constructor stub
		st = new Stack<>();
	}

	public boolean isEmpty() {
		return st.isEmpty();
	}

	public int size() {
		return st.size();
	}

	// O(N)
	public void Enqueue(int item) {
		Insert(st, item);

	}
	// O(N)
	private void Insert(Stack<Integer> st, int item) {
		if (st.isEmpty()) {
			st.push(item);
			return;
		}
		int x = st.pop();
		Insert(st, item);
		st.push(x);

	}
	// O(1)
	public int Dequeue() {
		return st.pop();
	}
	// O(1)
	public int getfront() {
		return st.peek();
	}

}
