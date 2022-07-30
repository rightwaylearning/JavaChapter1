package arithmatic_operation;

public class ArithmaticOperators {

	public static void main(String[] args) {
		
		byte b = 10;
		byte c = 20;
		
	//	byte a = b + c;
		
		        // max (int, byte, byte)>> result type int
		
		//  byte  >>> short >>>
		                 //    >>> int >>> long >> float >> doubl
		//             char >>>
		
		short s1 = 10;
		short s2 = 10;
		
		//short f = s1 +s2;  // up casting
		          //max (int, short, short)
		//System.out.println(f); // 20.0
		
		
		float f1 = 10;
		
		float f2  = 10.10f;
		
	    double i = f1 + f2;
	     System.out.println(i);
		      // max  (int, float, float) >> float
		
		
		
		
		char c1 ='A';
		
		byte b1 = 10;
		
		int   d1 = c1 + b1;
		
		System.out.println(d1);
		
		// -
		
		
		byte c2= 10;
		byte b2 = 10;
		
		int ans = c2-b2;
		System.out.println(ans);
		
		
		int m = c2*b2;
		
		                          // how to find out result type  
		                          // max(int, first operand data type, second operand data type)
		                          // +,-, *, /, %
		  
		 int c3 = 9;
		 int  c4 = 2;
	  
	     int  ans3 =  c3/c4;
	  
	     byte b4 = 24;
	     byte b5 = 5;
	     
	     int  and4 =  b4%b5;
	     
	  System.out.println(ans4);
	  
	  
		
		
		
		
		
	}
}
