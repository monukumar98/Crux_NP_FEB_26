package Lec12;

public class Arrays_2D_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[3][4];
		System.out.println(arr);
		System.out.println(arr[1]);
		System.out.println(arr[1][2]);
		// row
		int row = arr.length;
		int col = arr[0].length;
		int[][] temp = arr;
		int[][] arr1 = new int[3][];
		System.out.println(arr1[1]);

	}

}
