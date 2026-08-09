package Lec45;

public class Kartik_Bhaiya_And_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ababbabababaaaaa";
		int k = 2;
		int flip_a = Maximumlength(s, k, 'a');
		int flip_b = Maximumlength(s, k, 'b');
		System.out.println(Math.max(flip_a, flip_b));

	}

	private static int Maximumlength(String s, int k, char ch) {
		// TODO Auto-generated method stub
		int si = 0, ei = 0, flip = 0, ans = 0;
		while (ei < s.length()) {
			// grow
			if (s.charAt(ei) == ch) {
				flip++;

			}
			// shrink
			while (flip > k && si < ei) {
				if (s.charAt(si) == ch) {
					flip--;

				}
				si++;
			}
			// answer update
			ans = Math.max(ans, ei - si + 1);
			ei++;
		}
		return ans;
	}

}
