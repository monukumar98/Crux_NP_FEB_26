package Lec1;

public class Increment_Decrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 6;
//		System.out.println(x++);// x = x + 1; 6
//		System.out.println(x);// 7
//		int y = 11;
//		System.out.println(--y);
//		System.out.println(y);
//		int a = x++ - ++x - --x + x++ - x++;// -10
		int a = --x + --x - ++x + x++ - x++;
		System.out.println(a);
	}

}
