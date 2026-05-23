package Lec24;

public class Student {

	private String name;
	private int age;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name+" "+age;
	}

}
