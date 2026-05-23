package Lec24;

import Lec23.Stack;

public class DynamicStack extends Stack {
	@Override
	public void push(int item) throws Exception {
		if (isfull()) {
			int[] new_arr = new int[2 * arr.length];
			for (int i = 0; i < arr.length; i++) {
				new_arr[i] = arr[i];
			}
			arr=new_arr;
		}
		// element 
		super.push(item);

	}

}
