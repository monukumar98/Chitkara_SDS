package Abstract_InterFace;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b = new Bank() {

			@Override
			public boolean Recharge_Metro_Card() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean Payment() {
				// TODO Auto-generated method stub
				return false;
			}
			
		};
		Bank b1 = new Bank() {
			@Override
			public boolean Recharge_Metro_Card() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean Payment() {
				// TODO Auto-generated method stub
				return false;
			}
		};
//		b.Recharge_Metro_Card();
//		SBI_Class sb = new  SBI_Class();
		

	}

}
