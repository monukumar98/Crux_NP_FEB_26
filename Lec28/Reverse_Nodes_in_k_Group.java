package Lec28;

import java.util.Stack;

public class Reverse_Nodes_in_k_Group {

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
		public ListNode reverseKGroup(ListNode head, int k) {
			ListNode dummy = new ListNode();
			ListNode temp=dummy ;
			Stack<ListNode> st = new Stack<>();
			ListNode start=head;
			while(head!=null) {
				st.push(head);
				head=head.next;
				if(st.size()==k) {
					while(!st.isEmpty()) {
						dummy.next=st.pop();
						dummy=dummy.next;
					}
					start=head;
				}
			}
			if(st.size()>0) {
				dummy.next=start;
			}
			return temp.next;

		}
	}

}














