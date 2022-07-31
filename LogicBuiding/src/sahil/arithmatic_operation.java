package sahil;

public class arithmatic_operation {
	public static void main(String[] args) {
		int a= 10;
		int b= 20;
		int c= a+b;
		System.out.println(c);
		
		byte a1 = 45;
		byte b1 = 5;
		int c1 = a1+b1;
		System.out.println(c1);
		
		int c2 = 35;
		int d = 5;
		int e = c2-d;
		System.out.println(e);
		
		byte f = 15;
		int f1 = 2;
		int f2 = f*f1;
		System.out.println(f2);
		
		int s = 30;
		byte s1 = 5;
		int s2 = s/s1;
		System.out.println(s2);
		
		int  n = 5;
		long n1= 30;
		float n2 = n%n1;
		System.out.println(n2);
	System.out.println("==================================");			
		int n11 = 5365;
		int r; 
		
	
		r = n11 % 10; // 7
		System.out.println(r);  // 7
		n11 = n11/10; // 12
		
		r = n11% 10 ; // 2
		System.out.println(r); // 2
		n11=n11/10;// 1
		
		r = n11 % 10 ; // 1;
		System.out.println(r);  // 1
		n11 = n11/10; // 0
		
		r = n11%10;
		System.out.println(r);
		n11 = n11/10;
	}

}
