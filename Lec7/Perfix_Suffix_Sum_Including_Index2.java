package Lec7;

public class Perfix_Suffix_Sum_Including_Index2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 5, 6, 2, 4, 16, 7, 8, 9 };

	}

	public static void Perfix_Sum(int[] arr) {
		// prefix sum Including Index
		int[] left = new int[arr.length];
		left[0] = arr[0];
		for (int i = 1; i < left.length; i++) {
			left[i] = left[i - 1] + arr[i];
		}
		// suffix sum Including Index
		int[] right = new int[arr.length];
		right[right.length - 1] = arr[arr.length - 1];
		for (int i = right.length - 2; i >= 0; i--) {
			right[i] = right[i + 1] + arr[i];
		}

	}

}
