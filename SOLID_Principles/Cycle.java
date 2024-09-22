package SOLID_Principles;

public class Cycle extends Bike {

	@Override
	public boolean trunonengin()  {
		// TODO Auto-generated method stub
		try {
		throw new Exception("Cycle me engin nhi hota hai" );
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
		
	}

	@Override
	public boolean trunoffengin() {
		// TODO Auto-generated method stub
		return false;
	}
	


}
