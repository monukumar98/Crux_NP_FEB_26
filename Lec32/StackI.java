package Lec32;

public interface StackI {
	public static final int x = 9;

	public void push(int x);

	public int pop();

	// java 8
	public static void fun() {

	}

	default void fun1() {

	}
	// java 9

	private static void fun3() {

	}
}
