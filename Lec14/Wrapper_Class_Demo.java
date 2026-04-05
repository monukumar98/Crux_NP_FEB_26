package Lec14;

public class Wrapper_Class_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 9;
		Integer a1 = 10;
		System.out.println(a);
		System.out.println(a1);
		Long ll = 567l;
		long l = 5;
		// Auto-Boxing
		a1 = a;
		// UN-Boxing
		l = ll;

		Integer c1 = 19;
		Integer c2 = 19;
		Integer c3 = 191;
		Integer c4 = 191;
		System.out.println(c1 == c2);
		System.out.println(c3 == c4);
		System.out.println(c3.equals(c4));
		
		Boolean b1 =false;
		Boolean b2 =false;
		System.out.println(b1==b2);
		Character ch1='A';
		Character ch2='A';
		System.out.println(ch1==ch2);

	}

}







