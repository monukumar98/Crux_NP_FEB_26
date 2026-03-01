package Lec5;

public class base_4_To_Base_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2103;// base 4
		int sum = 0;
		int mul = 1;
		while (n > 0) {
			int rem = n % 10;
			sum = sum + rem * mul;
			mul = mul * 4;
			n = n / 10;
		}
		System.out.println(sum);
		int num=0;
		mul=1;
		while (sum > 0) {
			int rem = sum % 6;
			num = num + rem * mul;
			mul = mul * 10;
			sum = sum / 6;
		}
		System.out.println(num);
	}

}
