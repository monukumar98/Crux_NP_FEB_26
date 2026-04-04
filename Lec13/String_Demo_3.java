package Lec13;

import java.util.Scanner;

public class String_Demo_3 {
	public static void main(String[] args) {
		System.out.println("Hello" + 10 + 20 + "Bye");
		System.out.println("Hello" + (10 + 20) + "Bye");
		System.out.println(10 + 20 + "Hello" + "Bye");
		Scanner sc = new Scanner(System.in);
//		String s = sc.nextLine();
		String s = sc.next();
	//	char ch=sc.next().charAt(0);
		System.out.println(s);
	}
}
