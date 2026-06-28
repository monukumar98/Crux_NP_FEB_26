package Lec33;

public class LinkedList<T> {
	private class Node {
		T val;
		Node next;

		public Node(T val) {
			// TODO Auto-generated constructor stub
			this.val = val;
		}

	}

	private Node head;
	private Node tail;
	private int size;

	public int size() {
		return size;
	}

	// O(1)
	public void addfirst(T item) {
		Node node = new Node(item);
		if (size == 0) {
			head = node;
			tail = node;
			size++;
		} else {
			node.next = head;
			head = node;
			size++;

		}

	}

	// O(1)
	public void addlast(T item) {
		if (size == 0) {
			addfirst(item);
		} else {
			Node node = new Node(item);
			tail.next = node;
			tail = node;
			size++;
		}
	}

	// O(N)
	public void addatindex(int k, T item) {
		if (k == 0) {
			addfirst(item);
		} else if (k == size) {
			addlast(item);
		} else {
			Node node = new Node(item);
			Node prev = getNode(k - 1);
			node.next = prev.next;
			prev.next = node;
			size++;
		}
	}

	private Node getNode(int k) {
		Node temp = head;
		for (int i = 1; i <= k; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void Display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "-->");
			temp = temp.next;
		}
		System.out.println(".");

	}

	// O(1)
	public T getfirst() {
		return head.val;
	}

	// O(1)
	public T getlast() {
		return tail.val;
	}

	// O(N)
	public T getatindex(int k) {
		return getNode(k).val;
	}

	// O(1)
	public T removefirst() {
		Node curr = head;
		if (size == 1) {
			head = null;
			tail = null;
			size--;
		} else {
			head = head.next;
			curr.next = null;
			size--;
		}
		return curr.val;
	}

	public T removelast() {
		if (size == 1) {
			return removefirst();
		} else {
			Node prev = getNode(size - 2);
			T val = tail.val;
			tail = prev;
			tail.next = null;
			size--;
			return val;
		}

	}
    // O(N) 
	public T removeatindex(int k) {
		if (k == 0) {
			return removefirst();
		} else if (k == size - 1) {
			return removelast();
		} else {
			Node prev = getNode(k - 1);
			Node curr = prev.next;
			prev.next = curr.next;
			curr.next = null;
			size--;
			return curr.val;
		}

	}

}