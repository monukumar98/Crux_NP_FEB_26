package Lec1;

public class Lotter_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 768;
		if (n >= 100 && n <= 350) {
			System.out.println("Bike");
		} 
		else if (n >= 450 && n <= 585) {
			System.out.println("Mac");
		} 
		else if (n >= 51 && n <= 99) {
			System.out.println("Cycle");
		} 
		else if (n >= 642 && n <= 755) {
			System.out.println("Car");
		} 
		else {
			System.out.println("Happy BirthDay!!");
		}
	}

}
