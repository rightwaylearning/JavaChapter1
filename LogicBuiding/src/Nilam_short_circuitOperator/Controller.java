package Nilam_short_circuitOperator;

public class Controller {

	public static void main(String[] args) {

		Operator o = new Operator();

		boolean r = o.m1() && o.m2();
		System.out.println(r);

		int a = 20;
		int b = 30;

		boolean r1 = (++a > 21) && (++b > 30);
		System.out.println(r1);// false
		System.out.println(a); // 21
		System.out.println(b); // 30

		boolean r2 = (a++ < 30) && (b++ > 30);
		System.out.println(r2);// false
		System.out.println(a);// 22
		System.out.println(b);// 31

		boolean r3 = (a++ > 30) && (b++ < 35);
		System.out.println(r3);// false
		System.out.println(a);// 23
		System.out.println(b);// 31

		boolean r4 = (a++ > 20) && (++b > 30);
		System.out.println(r4);// true
		System.out.println(a);// 24
		System.out.println(b);// 32

	}

}
