package arithmatic_operation;

public class StringContcatinationOperator {

	public static void main(String[] args) {
		
		String s1 = "1";
		String s2 = "1";
		
		String r = s1 + s2;
		
		System.out.println(r); //"11"
		
		
		int a = 100;
		int b = 200;
		int c = 300;
		String s4 = "";
		
	     String  r1 = s4 + a + b + c;
	             // = "" + 100 + 200 + 300
	             // = "100" + 200 + 300
	             // = "100200" + 300;
	             // =  "100200300"
	           
	     System.out.println(r1);  // "100200300"
	     
	     String r3 = a + b + s4 + c;
	           //  = 100 + 200 + "" + 300
	           //  = 300 + "" + 300
	           //  =  "300" + 300
	           //  = "300300"
	     System.out.println(r3); // 300300
	     
		
		
	}
}
