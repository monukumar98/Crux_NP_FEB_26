package Lec16;

import java.util.*;

public class Generate_Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		List<String> ll = new ArrayList<>();
		Parenthese(0, 0, n, "",ll);
		System.out.println(ll);

	}

	public static void Parenthese(int open, int closed, int n, String ans,List<String> ll ) {
		// TODO Auto-generated method stub
		if (open == n && closed == n) {
			//System.out.println(ans);
			ll.add(ans);
			return;
		}
		if (open > n || closed > open) {
			return;
		}
		Parenthese(open + 1, closed, n, ans + "(",ll);
		Parenthese(open, closed + 1, n, ans + ")",ll);

	}

}
