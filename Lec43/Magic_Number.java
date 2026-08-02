package Lec43;

public class Magic_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;

	}

	public static int Nth_Magic_Number(int n) {
		int ans = 0;
		int mul = 5;
		while (n > 0) {
			if ((n & 1) != 0) {
				ans = ans + mul;
			}
			n >>= 1;
			mul = mul * 5;
		}
		return ans;
	}

}
