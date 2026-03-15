package Lec9;

public class Moore_Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 7, 2, 7, 2, 7 };

	}

	public static int Majority_Element(int[] arr) {
		int e = arr[0];
		int vote = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == e) {
				vote++;
			} else {
				vote--;
				if (vote == 0) {
					e = arr[i];
					vote = 1;
				}
			}
		}
		return e;
	}

}
