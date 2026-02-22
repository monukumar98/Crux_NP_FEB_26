package Lec3;

public class Pattern27 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int star = 1;
		int space = n - 1;
		while (row <= n) {
			// space
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}

			// star
			int j = 1;
			int val = 1;
			while (j <= star) {
				System.out.print(val + " ");
				if (j < star / 2 + 1) {
					val++;
				} 
				else {
					val--;
				}
				j++;
			}
			// next line ki Prep
			System.out.println();
			row++;
			star += 2;// star = star +2 ;
			space--;
		}

	}
}
