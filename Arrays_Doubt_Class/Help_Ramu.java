package Arrays_Doubt_Class;

import java.util.*;

public class Help_Ramu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			int c3 = sc.nextInt();
			int c4 = sc.nextInt();
			int n = sc.nextInt();// no of rickshaws
			int m = sc.nextInt();// no of cab
			int[] rickshaw = new int[n];
			int[] cab = new int[m];
			for (int i = 0; i < rickshaw.length; i++) {
				rickshaw[i] = sc.nextInt();
			}
			for (int i = 0; i < cab.length; i++) {
				cab[i] = sc.nextInt();
			}
			System.out.println(Help(c1, c2, c3, c4, rickshaw, cab));
		}

	}

	public static int Help(int c1, int c2, int c3, int c4, int[] rickshaw, int[] cab) {
		int rickshaw_cost = 0;
		for (int i = 0; i < rickshaw.length; i++) {
			rickshaw_cost += Math.min(rickshaw[i] * c1, c2);
		}
		rickshaw_cost = Math.min(rickshaw_cost, c3);
		int cab_cost = 0;
		for (int i = 0; i < cab.length; i++) {
			cab_cost += Math.min(cab[i] * c1, c2);
		}
		cab_cost = Math.min(cab_cost, c3);
		return Math.min(rickshaw_cost + cab_cost, c4);
	}

}
