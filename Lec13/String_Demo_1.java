package Lec13;

public class String_Demo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		System.out.println(s1);
		System.out.println(s4);
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
		int[] arr = new int[4];
		System.out.println(arr.length);
		System.out.println(s4.length());
		System.out.println(s1.charAt(2));

	}

}
