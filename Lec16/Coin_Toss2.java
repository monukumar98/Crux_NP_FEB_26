package Lec16;

public class Coin_Toss2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		Toss(n, "");

	}

	public static void Toss(int n, String ans) {
		if (n == 0) {
			System.out.println(ans);
			return;
		}
		if (ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H') {
			Toss(n - 1, ans + "H");
		}
		Toss(n - 1, ans + "T");

	}

	public static int Count_Toss(int n, String ans) {
		if (n == 0) {
			System.out.println(ans);
			return 1;
		}
		int x = 0;
		if (ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H') {
			x = Count_Toss(n - 1, ans + "H");
		}
		int y = Count_Toss(n - 1, ans + "T");
		return x + y;

	}
}













