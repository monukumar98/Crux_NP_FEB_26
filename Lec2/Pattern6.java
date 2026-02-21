package Lec2;

public class Pattern6 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int star = n;
		int space = 0;
		while (row <= n) {
			// space
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}

			// star
			int j = 1;
			while (j <= star) {
				System.out.print("* ");
				j++;
			}
			// next line ki Prep
			System.out.println();
			row++;
			star--;
			space += 2;// space = space +2 ;
		}

	}
}
