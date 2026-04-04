package Lec13;

public class Check_Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="nitin";

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
