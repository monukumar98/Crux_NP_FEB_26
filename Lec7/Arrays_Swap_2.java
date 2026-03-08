package Lec7;

public class Arrays_Swap_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 4, 5, 9 };
		System.out.println(arr[0] + " " + arr[1]);
		Swap(arr, 0, 1);
		System.out.println(arr[0] + " " + arr[1]);

	}

	public static void Swap(int[] arr, int i, int j) {
		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;

	}

}
