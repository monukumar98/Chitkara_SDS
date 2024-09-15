package OOps;

//import java.lang.Error;
public class Person {
	private int age = 19;
	private String name = "ankit";

	public int getAge() {
		return age;
	}

//	public void setAge(int age) throws Exception {
//		if (age < 0) {
//			throw new Exception("bklol age -ve nhi hoga ");
//
//		}
//		this.age = age;
//	}
	public void setAge(int age) {
		try {
			if (age < 0) {
				throw new Exception("bklol age -ve nhi hoga ");

			}
			this.age = age;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			System.out.println("Finaly Blocks");
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
}
