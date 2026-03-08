package Lec7;

public class Arrays_Swap_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] arr1 = new int[] { 1, 2, 4, 5, 9 };
		int[] arr = { 1, 2, 4, 5, 9 };
		System.out.println(arr[0] + " " + arr[1]);
		Swap(arr[0], arr[1]);
		System.out.println(arr[0] + " " + arr[1]);

	}

	public static void Swap(int a, int b) {
		int t = a;
		a = b;
		b = t;

	}
}
