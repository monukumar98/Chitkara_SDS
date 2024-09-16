package Class_Diagram;

public class Client {

	public static void main(String[] args) {
		// P obj = new P();
//		P obj = new C();
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		System.out.println(((C) (obj)).d2);
//		System.out.println(((C) (obj)).d);
//		obj.fun2();
//		//((C) (obj)).fun();
//		((C) (obj)).fun1();
//		obj.fun();

		// C obj = new P();
		C obj = new C();

		System.out.println(obj.d);
		System.out.println(((P) (obj)).d);
		System.out.println(obj.d1);
		System.out.println(obj.d2);
		obj.fun1();// c
		obj.fun2();// p
		obj.fun();// ?--> C
		((P) (obj)).fun();
	}

}
