package string.example;

public class StringClassDemo {

	public static void main(String[] args) {
	
		String s= "mahesh";
		s.concat("shinde");
		System.out.println(s);
		
       // --------------------------- 		
		

		String s1= "mahesh";
		s1 =s1.concat("shinde");
		System.out.println(s1);
		
		//--------------------
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>");
		
		String s2 = "bhaskar";
		s2.concat("reddy");
		System.out.println(s2);
		
		
		// StringBuffer & StringBuilder object are mutable
	// but String class object & all wrapper classes object are immutable
		StringBuffer s3 = new StringBuffer("bhaskar");
		s3.append("reddy");
		System.out.println(s3);
		
		
	// ======================================================
		
		
		String s5 ="Anupama";
		String s6 ="Anupama";
		String s7 ="Anupama";
		String s8 = s7.concat("Parmeshwaram");
				
		
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		String m = "abc";
		String m1 = "abc";
		System.out.println(m == m1);  // true
		System.out.println(m.equals(m1)); // true
		System.out.println(m.hashCode() == m1.hashCode()); // true
		
		String m2 = new String("abc");
		
		System.out.println(m == m2); // false
		System.out.println(m.equals(m2)); // true
		System.out.println(m.hashCode() == m2.hashCode()); // true
		
		
		
		
			
		
	}
}
