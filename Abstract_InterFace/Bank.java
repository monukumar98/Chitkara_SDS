package Abstract_InterFace;

public abstract class Bank {
	private int bal = 7789;

	public  int ViewBal() {
		return bal;
	}

	public abstract boolean Recharge_Metro_Card();

	public abstract boolean Payment();
}
