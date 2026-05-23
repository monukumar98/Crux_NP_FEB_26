package Lec24;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(2, 9));
		System.out.println(add(2, 9, 9));
		System.out.println(add(2, 9, 19l));
		System.out.println(add(5.7, 6));
		System.out.println(add(2, 6.9));
		System.out.println(add(2, 3, 34, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 1, 1, 1, 6));

	}

	public static int add(int x,int... a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;

	}

	public static int add(int x, int y) {
		return x + y;
	}

	public static int add(double x, int y) {
		return (int) (x + y);
	}

	public static int add(int x, int y, int z) {
		return x + y + z;
	}

	public static int add(int x, int y, long z) {
		return (int) (x + y + z);
	}

	public static int add(int x, double y) {
		return (int) (x + y);
	}

}
