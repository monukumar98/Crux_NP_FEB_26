package Lec23;

public class Student {
	private String name = "raj";
	private int age = 18;

	public Student() {

	}

	public Student(String name, int age) {
		this.age = age;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		try {
			if (age < 0 || age > 120) {
				throw new Exception("bklol age range me nhi h");
			}
			this.age = age;
		} 
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			System.out.println("I am in finally blocks");
		}
	}
//	public void setAge(int age) throws Exception {
//		if (age < 0 || age > 120) {
//			throw new Exception("bklol age range me nhi h");
//		}
//		this.age = age;
//	}

//	public String getName() {
//		return this.name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}

}
