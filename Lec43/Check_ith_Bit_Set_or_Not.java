package Lec43;

public class Check_ith_Bit_Set_or_Not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 84;
		int i = 4;
		System.out.println(Check_ith_Bit_Set(n, i));

	}

	public static boolean Check_ith_Bit_Set(int n, int i) {
		int mask = (1 << i);
		if ((n & mask) != 0) {
			return true;
		} else {
			return false;
		}
	}

}

