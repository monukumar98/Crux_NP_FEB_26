package Lec44;

import java.util.*;

public class Replace_Words {
	class Trie {
		class Node {
			char ch;
			String isterminal;
			HashMap<Character, Node> child;

			public Node(char ch) {
				// TODO Auto-generated constructor stub
				this.ch = ch;
				child = new HashMap<>();
			}
		}

		private Node root;

		public Trie() {
			// TODO Auto-generated constructor stub
			root = new Node('*');
		}

		public void insert(String word) {
			Node curr = root;
			for (int i = 0; i < word.length(); i++) {
				char ch = word.charAt(i);
				if (curr.child.containsKey(ch)) {
					curr = curr.child.get(ch);
				} else {
					Node node = new Node(ch);
					curr.child.put(ch, node);
					curr = node;
				}
			}
			curr.isterminal = word;

		}
		public String getString(String word) {
			Node curr=root;
			for (int i = 0; i < word.length(); i++) {
				char ch=word.charAt(i);
				if(curr.child.containsKey(ch)) {
					curr=curr.child.get(ch);
					if(curr.isterminal!=null) {
						return curr.isterminal;
					}
				}
				else {
					return word;
				}
				
			}
			return word;
		}
	}

	public String replaceWords(List<String> dictionary, String sentence) {
		Trie t = new Trie();
		for(String s:dictionary) {
			t.insert(s);
		}
		String [] arr=sentence.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			sb.append(t.getString(arr[i])+" ");
		}
		return sb.toString();

	}

}






