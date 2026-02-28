package Lec4;

public class Decimal_to_Bianry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 37;
		int mul = 1;// 10^0
		int sum = 0;
		while (n > 0) {
			int rem = n % 2;
			sum = sum + rem * mul;
			mul = mul * 10;
			n = n / 2;

		}
		System.out.println(sum);
	}

}
