package Arrays_Doubt_Class;

public class Get_the_Maximum_Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int Maximum_Score(int[] arr1, int[] arr2) {
		int s1 = 0, s2 = 0, i = 0, j = 0;
		long sum = 0;
		int mod = 1000_000_007;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				i++;
			} else if (arr1[i] > arr2[j]) {
				j++;
			} else {
				// s1 to i
				long sum1 = sum_of_Array(arr1, s1, i);
				// s2 to j
				long sum2 = sum_of_Array(arr2, s2, j);
				sum += Math.max(sum1, sum2);
				i++;
				j++;
				s1 = i;
				s2 = j;

			}

		}
		// s1 to i
		long sum1 = sum_of_Array(arr1, s1, arr1.length - 1);
		// s2 to j
		long sum2 = sum_of_Array(arr2, s2, arr2.length - 1);
		sum += Math.max(sum1, sum2);
		sum = sum % mod;
		return (int) (sum);
	}

	public static long sum_of_Array(int[] arr1, int si, int ei) {
		long sum = 0;
		for (int i = si; i <= ei; i++) {
			sum = sum + arr1[i];
		}
		return sum;
	}

}
