package Lec29;

import java.util.*;


public class Create_Tree_Using_Level_Order {
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
	public Create_Tree_Using_Level_Order() {
		// TODO Auto-generated constructor stub
		 Create_Tree();
	}
	private void Create_Tree() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int val=sc.nextInt();
		Node node=new Node(val);
		root=node;
		Queue<Node> q = new LinkedList<>();
		q.add(node);
		while(!q.isEmpty()) {
			Node n=q.poll();
			int c1=sc.nextInt();
			int c2=sc.nextInt();
			if(c1!=-1) {
				Node nn= new Node(c1);
				n.left=nn;
				q.add(nn);
			}
			if(c2!=-1) {
				Node nn= new Node(c2);
				n.right=nn;
				q.add(nn);
			}
		}
	}
	
}















