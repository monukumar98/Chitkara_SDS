package OOps;

public class Person_Client {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.out.println("Hey");
		Person p = new Person();
		try {
			p.setAge(-19);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println(e.getMessage());
			//System.err.println("intial vaue 19 hai "+e.getMessage());
		}
		System.out.println(p.getAge());
//		System.out.println("Hey");
//		System.err.println("Hey");
	}

}
