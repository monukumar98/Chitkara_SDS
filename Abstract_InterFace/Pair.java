package Abstract_InterFace;

public class Pair<T, K> {

	T x;
	K y;

	public Pair() {
		// TODO Auto-generated constructor stub
	}

	public Pair(T x, K y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}

	public T getX() {
		return x;
	}

	public K getY() {
		return y;
	}

	@Override
	public String toString() {
		return x + " " + y;
	}

}
