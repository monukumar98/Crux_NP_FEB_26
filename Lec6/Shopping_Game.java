package Lec6;

import java.util.Scanner;

public class Shopping_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int m = sc.nextInt();// Aayush
			int n = sc.nextInt();// Harshit
			Game(m, n);
			
		}
	}

	public static void Game(int m, int n) {
		int a = 0, h = 0;
		int phone = 1;
		while (true) {
			a += phone;
			if (a > m) {
				System.out.println("Harshit");
				break;
			}
			phone++;
			h += phone;
			if (h > n) {
				System.out.println("Aayush");
				break;
			}
			phone++;
		}

	}
}
