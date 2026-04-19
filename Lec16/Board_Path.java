package Lec16;

public class Board_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		Path(0, n, "");
	}

	public static void Path(int curr, int n, String ans) {
		// TODO Auto-generated method stub
		if (curr == n) {
			System.out.println(ans);
			return;
		}
		if (curr > n) {
			return;
		}
		
		for (int dice = 1; dice <=3; dice++) {
			Path(curr + dice, n, ans + dice);
		}
//		Path(curr + 1, n, ans + 1);
//		Path(curr + 2, n, ans + 2);
//		Path(curr + 3, n, ans + 3);

	}

}
