package Sahil_package;

public class typeConvertion {

	public static void main(String[] args) {
		byte b = 10;
		short s = b;  // type casting >> compiler
		
		short s1 = 10; 
		byte b1 = 10;  // as per size calculation compiler given error
		
		long l = 3276L;
		int i = 2542;  // same type 
		
		
		
		
		float f = 45768.8936475647345734F;
		System.out.println(f);
		
		double d = 45768.8936475647345734;
		System.out.println(d);
}
}