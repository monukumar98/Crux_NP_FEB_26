package Lec3;

public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int star = n;
		int space = n - 1;
		while (row <= 2 * n - 1) {
			// space
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			// start
			int j = 1;
			while (j <= star) {
				System.out.print("* ");
				j++;
			}

			// Mirror
			if (row < n) {
				star--;
				space--;
			} else {
				star++;
				space++;
			}

			// Next line ki prep
			System.out.println();
			row++;

		}

	}

}
