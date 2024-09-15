package OOps;

public class Student_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hey");

		Student s = new Student();
		System.out.println(s.name);
		System.out.println(s.age);
		s.name = "Kaju";
		s.age = 20;
		s.Intro_Your_Self();
		Student s1 = new Student("raj", 21);
		s1.Intro_Your_Self();
		Student.MentorName();
	}

	static {
		System.out.println("Student clinet class");
	}

}
