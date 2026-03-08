package Lec7;

public class Array_Demo_1 {
	public static void main(String[] args) {

		int[] arr = new int[5];
		System.out.println(arr);
		System.out.println(arr[1]);
		System.out.println(arr.length);

		int[] other = arr;
		other[0] = -9;
		System.out.println(arr[0]);

	}

}
