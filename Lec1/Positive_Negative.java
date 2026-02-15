package Lec1;

import java.util.*;

public class Positive_Negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// user input
		if (n > 0) {
			System.out.println("Positive");
		} else if (n < 0) {
			System.out.println("Negative");
		} else {
			System.out.println("Zero");
		}

	}

}
