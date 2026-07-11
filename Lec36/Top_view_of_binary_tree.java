package Lec36;

import java.util.*;

import Lec24.P;

public class Top_view_of_binary_tree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		public List<Integer> TopView(TreeNode root) {
			Queue<Pair> q = new LinkedList<>();
			TreeMap<Integer, Integer> map = new TreeMap<>();
			q.add(new Pair(root, 0));
			while (!q.isEmpty()) {
				Pair rp = q.poll();
				if (!map.containsKey(rp.vt)) {
					map.put(rp.vt, rp.root.val);
				}
				if (rp.root.left != null) {
					q.add(new Pair(rp.root.left, rp.vt - 1));
				}
				if (rp.root.right != null) {
					q.add(new Pair(rp.root.right, rp.vt + 1));
				}
			}
			List<Integer> ll = new ArrayList<>();
			for (int key : map.keySet()) {
				ll.add(map.get(key));
			}
			return ll;
		}

	}

	class Pair {
		TreeNode root;
		int vt;

		public Pair(TreeNode root, int vt) {
			// TODO Auto-generated constructor stub
			this.root = root;
			this.vt = vt;
		}
	}

}
