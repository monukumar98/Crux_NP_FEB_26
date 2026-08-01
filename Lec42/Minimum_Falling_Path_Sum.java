package Lec42;

import java.util.Arrays;

public class Minimum_Falling_Path_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };
		int ans = Integer.MAX_VALUE;
		int [] [] dp = new int [matrix.length][matrix[0].length];
		for(int [] a:dp) {
			Arrays.fill(a, -999999);
		}
		for (int i = 0; i < matrix[0].length; i++) {
			ans = Math.min(ans, Falling_Path_Sum(matrix, 0, i,dp));
		}
	}

	public static int Falling_Path_Sum(int[][] matrix, int cr, int cc,int [][]dp) {
		if (cc < 0 || cc >= matrix[0].length || cr >= matrix.length) {
			return Integer.MAX_VALUE;
		}
		if (cr == matrix.length - 1) {
			return matrix[cr][cc];
		}
		if(dp[cr][cc]!=-999999) {
			return dp[cr][cc];
		}
		int ld = Falling_Path_Sum(matrix, cr + 1, cc - 1,dp);
		int rd = Falling_Path_Sum(matrix, cr + 1, cc + 1,dp);
		int down = Falling_Path_Sum(matrix, cr + 1, cc,dp);
		return dp[cr][cc]=Math.min(rd, Math.min(ld, down)) + matrix[cr][cc];
	}

}
