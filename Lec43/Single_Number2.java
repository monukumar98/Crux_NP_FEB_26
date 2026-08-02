package Lec43;

public class Single_Number2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 1, 3, 2, 5 };

	}

	public static int[] singleNumber(int[] nums) {
		int xor = 0;
		for (int i = 0; i < nums.length; i++) {
			xor = xor ^ nums[i];
		}
		int mask = (xor & (-1 * xor));
		int a = 0;
		for (int i = 0; i < nums.length; i++) {
			if ((nums[i] & mask) == 0) {
				a = a ^ nums[i];
			}
		}
		int b = xor ^ a;
		return new int[] { a, b };

	}

}
