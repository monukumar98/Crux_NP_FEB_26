package Lec22;

public class Student_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		Student s = new Student();
		s.name = "raj";
		s.age = 22;
		s.Intro_yourSelf();
		Student s1 = new Student();
		s1.name = "raju";
		s1.age = 24;
		s1.Intro_yourSelf();
		s.SayHey("knual");
		Student.Mentor_Name();
		

	}
	static {
		System.out.println("I am in Static blocks Main wala ");
	}

}
