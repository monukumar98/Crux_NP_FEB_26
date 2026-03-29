package Lec12;

public class Wave_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3, 4 }, { 7, 6, 5, 8 }, { 11, 9, 10, 12 } };
		Print(arr);
	}
	public static void Print(int [][]arr){
		for (int col = 0; col < arr[0].length; col++) {
			if(col%2==0) {
				for (int row = 0; row < arr.length; row++) {
					System.out.print(arr[row][col]+" ");
				}
			}
			else {
				for(int row=arr.length-1; row>=0; row--) {
					System.out.print(arr[row][col]+" ");
				}
			}
		}
		
	}
}
