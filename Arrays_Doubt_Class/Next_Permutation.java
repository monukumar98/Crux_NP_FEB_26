package Arrays_Doubt_Class;

public class Next_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3 };

	}

	public static void Permutation(int[] arr) {
		int n = arr.length;
		int p = -1;
		// 1. step find p
		for (int i = n - 2; i >= 0; i--) {
			if (arr[i] < arr[i + 1]) {
				p = i;
				break;
			}
		}
		if (p == -1) {
			Reverse(arr, 0, n - 1);
			return;
		}
		// 2. step find q
		int q = 0;
		for (int i = n - 1; i > p; i--) {
			if (arr[i] > arr[p]) {
				q = i;
				break;
			}
		}
		// 3. Swap p & q
		int temp = arr[p];
		arr[p] = arr[q];
		arr[q] = temp;

		// 4. revese p+1 to n-1
		Reverse(arr, p + 1, n - 1);

	}

	public static void Reverse(int[] arr, int i, int j) {
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}

	}

}
