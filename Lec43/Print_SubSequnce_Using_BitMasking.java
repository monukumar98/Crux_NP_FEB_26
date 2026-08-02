package Lec43;

public class Print_SubSequnce_Using_BitMasking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		Print_SubSequnce(s);

	}

	public static void Print_SubSequnce(String s) {
		int n = s.length();
		for (int i = 0; i < (1 << n); i++) {
			String str = SubSequnce(s, i);
			System.out.println(str);
		}
	}

	public static String SubSequnce(String s, int i) {
		// TODO Auto-generated method stub
		int pos = 0;
		String ans = "";
		while (i > 0) {
			if ((i & 1) != 0) {
				ans = ans + s.charAt(pos);
			}
			i >>= 1;
			pos++;
		}
		return ans;
	}

}
