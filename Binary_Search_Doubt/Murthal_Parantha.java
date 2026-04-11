package Binary_Search_Doubt;

import java.util.Arrays;

public class Murthal_Parantha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int parantha = 10;
		int[] rank = { 1, 2, 4, 3 };// cook wali rank hai
		System.out.println(minimum_time(rank, parantha));

	}

	public static int minimum_time(int[] rank, int parantha) {
		int lo = 0;
		int max = Arrays.stream(rank).max().getAsInt();
		int hi = max * (parantha * (parantha + 1) / 2);
		int ans = 0;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (isitpossible(rank, parantha, mid)) {
				ans = mid;
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}
		return ans;
	}
	public static boolean isitpossible(int[] rank, int parantha, int mid) {
		// TODO Auto-generated method stub
		int count=0;
		for (int i = 0; i < rank.length; i++) {
			count+=Number_of_Parantha(rank[i], mid);
			if(count>=parantha) {
				return true;
			}
		}
		return false;
	}

	public static int Number_of_Parantha(int rank, int time) {
		int tt = 0;
		int p = 1;
		while (tt + p * rank <= time) {
			tt += p * rank;
			p++;
		}
		return p - 1;
	}

}
