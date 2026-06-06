package Lec27;

public class LinkedList {
	private class Node {
		int val;
		Node next;

		public Node(int val) {
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
	public void addfirst(int item) {
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
	public void addlast(int item) {
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
	public void addatindex(int k, int item) {
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
	public int getfirst() {
		return head.val;
	}

	// O(1)
	public int getlast() {
		return tail.val;
	}

	// O(N)
	public int getatindex(int k) {
		return getNode(k).val;
	}

	// O(1)
	public int removefirst() {
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

	public int removelast() {
		if (size == 1) {
			return removefirst();
		} else {
			Node prev = getNode(size - 2);
			int val = tail.val;
			tail = prev;
			tail.next = null;
			size--;
			return val;
		}

	}
    // O(N) 
	public int removeatindex(int k) {
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
