package OOps;

public class Student {

	int age = 19;
	String name = "ankit";

	public Student() {

	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public void Intro_Your_Self() {
		System.out.println("My name is  " + this.name + " and  " + this.age);
	}

	public static void MentorName() {
		System.out.println("Monu bhaiya");
	}
	static {
		System.out.println("Student class");
	}
}
