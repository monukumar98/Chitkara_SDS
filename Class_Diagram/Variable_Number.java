package Class_Diagram;

public class Variable_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 9, b = 7, c = 8;
		System.out.println(add(a, b));
		System.out.println(add(a, b, c));
		System.out.println(add(2, 3, 4, 65, 6, 3, 2, 1, 1, 1, 1, 77, 3, 8, 3, 9, 4, 5, 67, 5, 11, 6, 6));

	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int add(int a, int b, int c) {
		return a + b + c;
	}

	public static int add(int x, int... a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

}
