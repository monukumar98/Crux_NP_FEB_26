package Lec45;

public class Subarray_Product_Less_Than_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 10, 5, 2, 6 };
		int k = 100;
		System.out.println(Product_Less_Than_K(nums, k));
	}

	public static int Product_Less_Than_K(int[] nums, int k) {
		int si = 0, ei = 0, p = 1, ans = 0;
		while (ei < nums.length) {
			// window grow
			p = p * nums[ei];
			// window shrink
			while (p >= k) {
				p = p / nums[si];
				si++;
			}
			// ans update
			ans = ans + (ei - si + 1);

			ei++;
		}
		return ans;

	}
}
