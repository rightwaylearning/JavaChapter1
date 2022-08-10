package Akshay_Array;

public class two_d_Array {

	public static void main(String[] args) {

		test[][] p = new test[2][3];

		p[0][0] = new test();

		p[0][0].a = 10;
		p[0][1].a = 20;
		p[0][2].a = 30;
		
		p[0][1] = new test ();
		
		p[1][0].a = 40;
		p[1][1].a = 50;
		p[1][2].a = 60;

//		a[0][0] = 10;
//		a[0][1] = 20;
//		a[0][2] = 30;
//		a[1][0] = 40;
//		a[1][1] = 50;
//		a[1][2] = 60;
//		System.out.println(a[0][0]); // Answer is = 10

		p[0][0].showDetails();
		System.out.println("============================");

//		for (int i = 0; i < 3; i++)
//			p[i][i].showDetails();

	}

}
