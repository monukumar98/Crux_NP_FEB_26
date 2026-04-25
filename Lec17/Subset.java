package Lec17;

public class Subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3 };
		int target = 3;
		System.out.println("\n" + print(arr, 0, "", 0, target));

	}

	public static int print(int[] arr, int i, String ans, int sum, int target) {
		if (i == arr.length) {
			if (sum == target) {
				System.out.print(ans + " ");
				return 1;
			}
			return 0;
		}

		int x = print(arr, i + 1, ans, sum, target);
		int y = print(arr, i + 1, ans + arr[i] + " ", sum + arr[i], target);
		return x + y;
	}

}
