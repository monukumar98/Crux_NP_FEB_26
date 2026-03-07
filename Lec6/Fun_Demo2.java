package Lec6;

public class Fun_Demo2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		int a = 8;
		int b = 9;
//		int ans=add(b, a);
//		System.out.println(ans);
		System.out.println(add(a, b));
		System.out.println("Bye");

	}

	public static int add(int a, int b) {

		int c = a + b;
		return c + sub(c, a);
	}

	public static int sub(int a, int b) {

		int c = a - b;
		return c;
	}
}


