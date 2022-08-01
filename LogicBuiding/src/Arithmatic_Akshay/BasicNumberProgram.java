package Arithmatic_Akshay;

public class BasicNumberProgram {

	public static void main(String[] args) {
//		int n = 12309;
//		System.out.println(n/10); // 1230
//		System.out.println(n%10);  // 9
		
		int a = 125;
		int b;
		int b1;
		
		System.out.println("Main Value is = 125");
		
		b = a%10;
		b1 = a/10;
		System.out.println(b1);
		System.out.println(b);
		System.out.println("------------------------------------");
		
		int p = 1234;
		int q;
		int q1;
		int q2;
		int q3;
		int q4;
		int q5;
		int q6;
		
		System.out.println("Main Value is = 1234 \n\nDivision\n");
		
		q = p/10;
		q1= q/10;
		q2 = q1/10;
		
		 q3 = p % 10;
		 q4 = q % 10;
		 q5 = q1 % 10;
		 q6 = q2 % 10;
		
		System.out.println(q);
		System.out.println(q1);
		System.out.println(q2);
		System.out.println("\nModulas\n");
		System.out.println(q3);
		System.out.println(q4);
		System.out.println(q5);
		System.out.println(q6);
		
		System.out.println("------------------------------------");
		
	}
}
