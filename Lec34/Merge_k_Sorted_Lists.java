package Lec34;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Merge_k_Sorted_Lists {
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	class Solution {
		public ListNode mergeKLists(ListNode[] lists) {
//			PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>() {
//				@Override
//				public int compare(ListNode o1, ListNode o2) {
//					return o1.val - o2.val;
//				}
//			});
			PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
			ListNode dummy = new ListNode();
			ListNode temp = dummy;
			for (int i = 0; i < lists.length; i++) {
				if (lists[i] != null) {
					pq.add(lists[i]);
				}
			}
			while (!pq.isEmpty()) {
				ListNode rn = pq.poll();
				dummy.next = rn;
				dummy = dummy.next;
				if (rn.next != null) {
					pq.add(rn.next);
				}
			}
			return temp.next;

		}
	}

}
