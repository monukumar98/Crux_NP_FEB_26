package Lec34;

import java.util.Arrays;

public class Meeting_Rooms_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intervals = { { 9, 30 }, { 5, 10 }, { 15, 20 }, { 6, 9 }, { 2, 6 }, { 3, 5 } };
//		Arrays.sort(intervals,(a,b)->a[0]-b[0]);
//		for (int i = 0; i < intervals.length; i++) {
//			System.out.println(intervals[i][0] + " " + intervals[i][1]);
//		}
	}

	public static int Meeting_Rooms(int[][] intervals) {
		Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

	}

}
