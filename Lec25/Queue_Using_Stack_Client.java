package Lec25;

public class Queue_Using_Stack_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue_Using_Stack q = new  Queue_Using_Stack();
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
		q.Enqueue(40);
		q.Enqueue(50);
		q.Enqueue(60);
		System.out.println(q.Dequeue());
		System.out.println(q.getfront());

	}

}
