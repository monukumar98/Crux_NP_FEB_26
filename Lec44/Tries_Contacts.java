package Lec44;

import java.util.HashMap;
public class Tries_Contacts {
	class Node {
		char ch;
		boolean isterminal;
		HashMap<Character, Node> child;
        int count=1; 
		public Node(char ch) {
			// TODO Auto-generated constructor stub
			this.ch = ch;
			child = new HashMap<>();
		}
	}

	private Node root;

	public Tries_Contacts() {
		// TODO Auto-generated constructor stub
		root = new Node('*');
	}
	public void insert(String word) {
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
				curr.count++;
			} else {
				Node node = new Node(ch);
				curr.child.put(ch, node);
				curr = node;
			}
		}
		curr.isterminal = true;

	}
	public int find(String word) {
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
			} else {
				return 0;
			}
		}
		return curr.count;
	}

}
