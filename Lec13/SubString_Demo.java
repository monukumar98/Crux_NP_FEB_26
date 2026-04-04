package Lec13;

public class SubString_Demo {
	public static void main(String[] args) {
		String s = "codingblocks";
		System.out.println(s.substring(2, 5));
		System.out.println(s.substring(1));
		System.out.println(s.substring(1, 1));
		printall(s);

	}

	public static void printall(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String s1=s.substring(i, j);
				if(isPalindrom(s1)) {
					System.out.println(s1);
				}
			}
		}
	}
	public static boolean isPalindrom(String s) {
		int i=0,j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}


}
