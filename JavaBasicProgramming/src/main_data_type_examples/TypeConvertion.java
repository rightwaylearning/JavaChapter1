package main_data_type_examples;

public class TypeConvertion {

	
	public static void main(String[] args) {
		byte b = 10;
		short s = b;  // type casting >> compiler
		
		short s1 = 10;
//		byte b1 = s1;  // as per size calculation compiler given error
		
		long l = 3276L;
//		int i = l;  // same type missmatch
		
		
		for(int i =0 ;i<=200;i++) {
			char ch =(char)i;
			System.out.println(i+"  >>  "+ch);
		}
		
		float f = 45768.8936475647345734F;
		System.out.println(f);
		
		double d = 45768.8936475647345734;
		System.out.println(d);
		
	}
}
