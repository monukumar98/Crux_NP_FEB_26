package Lec29;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
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
	Scanner sc = new Scanner(System.in);

	public BinaryTree() {
		// TODO Auto-generated constructor stub
		root = CreateTree();
	}

	private Node CreateTree() {
		// TODO Auto-generated method stub
		int x = sc.nextInt();
		Node nn = new Node(x);
		boolean hlc = sc.nextBoolean();
		if (hlc) {
			nn.left = CreateTree();
		}
		boolean hrc = sc.nextBoolean();
		if (hrc) {
			nn.right = CreateTree();
		}
		return nn;
	}

	public void display() {
		display(root);
	}

	private void display(Node node) {
		if (node == null) {
			return;
		}

		String s = "<--" + node.val + "-->";
		if (node.left != null) {
			s = node.left.val + s;
		} else {
			s = "." + s;
		}
		if (node.right != null) {
			s = s + node.right.val;
			;
		} else {
			s = s + ".";
		}
		System.out.println(s);
		display(node.left);
		display(node.right);

	}

	public int max() {
		return max(root);
	}

	private int max(Node nn) {
		if (nn == null) {
			return Integer.MIN_VALUE;
		}
		int val = nn.val;
		int left_max = max(nn.left);
		int right_max = max(nn.right);
		return Math.max(val, Math.max(left_max, right_max));

	}

	public boolean find(int val) {
		return find(root, val);
	}

	private boolean find(Node nn, int val) {
		if (nn == null) {
			return false;
		}
		if (nn.val == val) {
			return true;
		}
		boolean left = find(nn.left, val);
		boolean right = find(nn.right, val);
		return left || right;

	}

	public int ht() {
		return ht(root);
	}

	private int ht(Node node) {
		if (node == null) {
			return -1;
		}
		int lh = ht(node.left);
		int rh = ht(node.right);
		return Math.max(lh, rh) + 1;
	}

	public void PerOrder() {
		PerOrder(root);
		System.out.println();
	}

	private void PerOrder(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}
		System.out.print(node.val + " ");
		PerOrder(node.left);
		PerOrder(node.right);

	}

	public void InOrder() {
		InOrder(root);
		System.out.println();
	}

	private void InOrder(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}
		InOrder(node.left);
		System.out.print(node.val + " ");
		InOrder(node.right);

	}

	public void PostOrder() {
		PostOrder(root);
		System.out.println();
	}

	private void PostOrder(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}
		PostOrder(node.left);
		PostOrder(node.right);
		System.out.print(node.val + " ");

	}

	public void LevelOrder() {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			Node rn = q.poll();
			System.out.print(rn.val + " ");
			if (rn.left != null) {
				q.add(rn.left);
			}
			if (rn.right != null) {
				q.add(rn.right);
			}
		}
		System.out.println();
	}

}
