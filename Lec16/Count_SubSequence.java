package Lec16;

public class Count_SubSequence {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abc";
		System.out.println("\n"+print(ques, ""));

	}

	public static int print(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans + " ");
			return 1;
		}
		char ch = ques.charAt(0);
		int x = print(ques.substring(1), ans);
		int y = print(ques.substring(1), ans + ch);
		return x + y;

	}

//	static int c = 0;

//	public static void print(String ques, String ans) {
//		if (ques.length() == 0) {
//			System.out.print(ans + " ");
//			c++;
//			return;
//		}
//		char ch = ques.charAt(0);
//		print(ques.substring(1), ans);
//		print(ques.substring(1), ans + ch);
//
//	}
}
