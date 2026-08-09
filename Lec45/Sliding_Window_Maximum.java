package Lec45;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Sliding_Window_Maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int k = 3;
	}

	public static int[] Window_Maximum(int[] arr, int k) {
		Deque<Integer> dq = new ArrayDeque<>();
		int[] ans = new int[arr.length - k + 1];
		int j = 0;
		for (int i = 0; i < k; i++) {
			while (!dq.isEmpty() && arr[i] > arr[dq.getLast()]) {
				dq.removeLast();
			}
			dq.add(i);
		}
		ans[j++] = arr[dq.getFirst()];
		for (int i = k; i < arr.length; i++) {
			// grow
			while (!dq.isEmpty() && arr[i] > arr[dq.getLast()]) {
				dq.removeLast();
			}
			dq.add(i);
			// shrink
			if (dq.getFirst() == i - k) {
				dq.removeFirst();
			}
			ans[j++] = arr[dq.getFirst()];
		}
		return ans;
	}

}
