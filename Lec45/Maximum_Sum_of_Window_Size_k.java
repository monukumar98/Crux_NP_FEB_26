package Lec45;

public class Maximum_Sum_of_Window_Size_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 5, 1, 3, 1, 2, 7, 9, 4 };
		int k = 3;
		System.out.println(Sum_of_Window_Size_k(arr, k));
	}

	public static int Sum_of_Window_Size_k(int[] arr, int k) {
		int sum = 0, ans = 0;
		for (int i = 0; i < k; i++) {
			sum = sum + arr[i];
		}
		ans = sum;
		for (int i = k; i < arr.length; i++) {
			// window grow
			sum = sum + arr[i];
			// window shrink
			sum = sum - arr[i - k];
			// answer update
			ans = Math.max(ans, sum);
		}
		return ans;
	}

}
