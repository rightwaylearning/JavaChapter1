package Akshay_Short_Cicuit_Opr;

public class Controller {

	public static void main(String[] args) {

		Test P = new Test();

		boolean r = P.a1() && P.a2() && P.a3();

		System.out.println(r);
		System.out.println("============================");

		int a1 = 15;
		int a2 = 20;

		boolean r1 = ++a1 > 15 && ++a2 > 20; // PreIncrement method

		System.out.println(r1); // Answer is = True
		System.out.println(a1); // Answer is = 16
		System.out.println(a2); // Answer is = 21

		System.out.println("============================");

		boolean r2 = ++a1 > 15 && ++a2 > 20; // PreIncrement method

		System.out.println(r2); // Answer is = True
		System.out.println(a1); // Answer is = 17
		System.out.println(a2); // Answer is = 22
		System.out.println("============================");

		int b1 = 25;
		int b2 = 30;

		boolean r3 = b1++ > 20 && b2++ > 25; // PostIncrement Method

		System.out.println(r3); // Answer is = True
		System.out.println(b1); // Answer is = 26
		System.out.println(b2); // Answer is = 30
		System.out.println("============================");

		System.out.println(r3); // Answer is = True
		System.out.println(b1); // Answer is = 26
		System.out.println(b2); // Answer is = 31
		System.out.println("============================");

		int x = 11;
		int y = 11;

		boolean r4 = x++ > 11 && ++y > 11;

		System.out.println(r4); // false
		System.out.println(x); // Answer is = 12
		System.out.println(y); // Answer is = 11 //Due to 1st statement is false then they will not calculate (++y >11),
								// only give same value of int y = 11.
	}

}
