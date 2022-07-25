package main_data_type_examples;

public class Upcasting$DownCasting {

	public static void main(String[] args) {
		
		// upcasting 
		
		byte b = 10;
		float f = b; // 10.0
		
		char ch = 'A';
		
		float f1 = ch;// 65.0
		float f2 = 'A';  // 65.0
		
		long l = 456L;
		float f3 = l;
		float f4 = 456L;
		
		int i1 = 'Z';
		
		double d11 = 237857L;
		
		// --------------------
		// downcasting
		// 1] we have to handle typecasting operation
		// 2] unpredictable ans some time
		// 3] data loss
		// 4] not safe operation
		int y = 10;
		byte b11= (byte)y;  // 10;
		
		int y1 = 250;
		byte b12 = (byte)y1;
		System.out.println(b12);
		
		
		float f13 = 123.45F;
		int i14 = (int)f13;
		System.out.println(i14);
		
		
		
		
		
		
		
		
		
	}
}
