package sahil;

public class equalityOperator {
	

		public static void main(String[] args) {
			
			int a = 40;
			int b = 70;
			
			boolean c = a == b; // Answer is = False
			boolean d = a != b; // Answer is = True
			
	System.out.println(c);
	System.out.println(d);
	System.out.println("*************************************");
	
	

	// 1. [==] - is equal to
	// 2. [!-] - is not equal to
	// 3. Here we can use 'byte, int, short, long, float, double' Primitive data types 
	//    for assign value or data except boolean data type.
	// 4. But always answer will be show in boolean data type.
	// 5. boolean data type can use in below conditional case.
	

	long f= 64;
	short g=65;
	
	boolean h= f ==g;
	boolean j= f !=g;
	System.out.println(h);
	System.out.println(j);
	System.out.println("=================================");
	
	
	String r = "sahil bagade";
	String t = "bagade";
	
	boolean y= r ==t;
	boolean u = r !=t;
	System.out.println(y);
	System.out.println(u);
	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	
	
	String i="sahil bagade";
	String o=" bagade";
	String p="sahil ";
	
	boolean z=i ==o;
	boolean x=o !=i;
	boolean n = p ==o;
	
	System.out.println(z);
	System.out.println(x);
	System.out.println(n);
	System.out.println("=================================");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}


}