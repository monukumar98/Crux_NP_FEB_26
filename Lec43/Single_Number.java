package Lec43;

public class Single_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int singleNumber(int[] nums) {
		int xor = 0;
		for (int i = 0; i < nums.length; i++) {
			xor = xor ^ nums[i];
		}
		return xor;
	}

}
