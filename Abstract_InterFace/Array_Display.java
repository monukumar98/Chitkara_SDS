package Abstract_InterFace;

public class Array_Display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = { 10, 203, 5, 8 };
		display(arr);
		String[] arr1 = { "Raj", "Ankit", "Ankita", "Pooja" };
		display(arr1);

	}

	public static <T>void display(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
