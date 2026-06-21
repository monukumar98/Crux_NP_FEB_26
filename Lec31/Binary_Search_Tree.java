package Lec31;

public class Binary_Search_Tree {

	class Node {
		int val;
		Node left;
		Node right;

		public Node(int val) {
			// TODO Auto-generated constructor stub
			this.val = val;
		}
	}

	private Node root;

	public Binary_Search_Tree(int[] in) {
		// TODO Auto-generated constructor stub
		root = createTree(in, 0, in.length - 1);
	}

	private Node createTree(int[] in, int si, int ei) {
		// TODO Auto-generated method stub
		if (si > ei) {
			return null;
		}
		int mid = (si + ei) / 2;
		Node node = new Node(in[mid]);
		node.left = createTree(in, si, mid - 1);
		node.right = createTree(in, mid + 1, ei);
		return node;
	}

	private int max(Node root) {
		if (root == null) {
			return Integer.MIN_VALUE;
		}
		int right = max(root.right);
		return Math.max(right, root.val);

	}
	private int min(Node root) {
		if (root == null) {
			return Integer.MAX_VALUE;
		}
		int left = min(root.left);
		return Math.min(left, root.val);
		
	}

}












