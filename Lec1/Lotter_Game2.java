package Lec1;

public class Lotter_Game2 {
	public static void main(String[] args) {
		int n = 701;
		if (n >= 100 && n <= 350) {
			System.out.println("Bike");
			if(n<=289) {
				System.out.println("Hero wala Bike");
			}
			else {
				System.out.println("KTM");

			}
		} 
		else if (n >= 450 && n <= 585) {
			System.out.println("Mac");
			if(n<=519) {
				System.out.println("M1");
			}
			else {
				System.out.println("M2");
			}
		} 
		else if (n >= 51 && n <= 99) {
			System.out.println("Cycle");
			if(n<=79) {
				System.out.println("ATLAS");
			}
			else {
				System.out.println("Avon");
			}
		} 
		else if (n >= 642 && n <= 755) {
			System.out.println("Car");
			if(n<=700) {
				System.out.println("Thar");
			}
			else {
				System.out.println("Creta");
			}
		} 
		else {
			System.out.println("Happy BirthDay!!");
		}
	}
}
