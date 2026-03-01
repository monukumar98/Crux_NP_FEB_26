package Lec5;

import java.util.Scanner;

public class Chewbacca_and_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long l = sc.nextLong();
		long sum = 0;
		long mul = 1;
		while (l > 9) {
			long rem = l % 10;
			if (rem >= 5) {
				rem = 9 - rem;
			}
			sum = sum + rem * mul;
			mul = mul * 10;
			l = l / 10;
		}
		if (l <= 4 || l == 9) {
			sum = sum + l * mul;
		} else {
			sum = sum + (9 - l) * mul;
		}
		System.out.println(sum);
	}

}
