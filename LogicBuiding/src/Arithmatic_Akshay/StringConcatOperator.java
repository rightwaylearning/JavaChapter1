package Arithmatic_Akshay;

public class StringConcatOperator {
	
	public static void main(String[] args) {
		
		String a = "1";
		String b = "1";
		
		String c = a+b;
		System.out.println(c);
		
		int a1 = 200;
		int a2 = 400;
		int a3 = 600;
		String d = "";
		
		String e = d+a1+a2+a3;
		// = "" + 200 + 400 + 600
        // = "200" + 400 + 600;
        // = "200400" + 600;
        // =  "200400600"
		System.out.println(e);
		System.out.println("----------------------------------");
		
		String p = "";
		int q = 100;
		int r = 200;
		int s = 300;
		String t = q + r + p + s;
		
//		= 100 + 200 + "" + 300
//		= 300 + "" + 300
//		= 300+"300"
//		= "300300"
		
		System.out.println(t);
		System.out.println("----------------------------------");
		
		
		
	}

}
