package Lec3;

import java.util.Scanner;

public class Pattern_Rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int spcae = n - 1;
		int star = 1;
		int val = 1;
		while (row <= 2 * n - 1) {
			// space
			int i = 1;
			while (i <= spcae) {
				System.out.print("\t");
				i++;
			}
			// star
			int j = 1;
			int p = val;// ye har row ka staring point bata raha hai
			while (j <= star) {
				System.out.print(p + "\t");
				if (j < star / 2 + 1) {
					p++;
				} else {
					p--;
				}
				j++;
			}
			// mirror
			if (row < n) {
				star += 2;
				spcae--;
				val++;
			} else {
				star -= 2;
				spcae++;
				val--;
			}
			// next line ki prep
			row++;

			System.out.println();
		}

	}

}
