package Lec32;

public class Stack_Class_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	StackI st = new StackI();
		Stack_Class st1 = new Stack_Class();
		StackI st = new StackI() {

			@Override
			public void push(int x) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public int pop() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			
		};
	}

}
