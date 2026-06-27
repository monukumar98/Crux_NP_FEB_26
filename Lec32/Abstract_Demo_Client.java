package Lec32;

public class Abstract_Demo_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Abstract_Demo ab = new  Abstract_Demo();
//		System.out.println(ab.PayAmount(100));
		Abstract_Demo2 ab = new Abstract_Demo2();
		
		Abstract_Demo ab1 = new  Abstract_Demo() {

			@Override
			public boolean PayAmount(int x) {
				// TODO Auto-generated method stub
				return false;
			}
			
		};
		Abstract_Demo ab2 = new  Abstract_Demo() {
			
			@Override
			public boolean PayAmount(int x) {
				// TODO Auto-generated method stub
				return false;
			}
			
		};
				
	}

}
