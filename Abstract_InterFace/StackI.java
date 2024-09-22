package Abstract_InterFace;

public interface StackI {

	public static final int x = 9;

	public void push(int item);

	public int pop(int item);

	public int peek(int item);

	// java 8
	public static void fun() {
//		return 0;
	}

	default void fun1() {

	}
	// jave 9

	private static void fun2() {
//		return 0;
	}

	private void fun6() {

	}
}
