package main_package;

public class DownCasting {

	public static void main(String[] args) {
		
		int n = 10;
		byte b = (byte)n;  // here developer done type casting 
		System.out.println(b);
		
		
		int n1 = 250;
		byte b1 = (byte)n1; // here developer done type casting 
		// byte range is + 127 to -128
		System.out.println(b1);
		
		int ch = 65;
		char ch1 = (char)ch;
		System.out.println(ch1);
		
		
		int ch2 = 9999999;
		char ch3 = (char)ch2;  // range of char 0 to 65535
		System.out.println(ch3);
		
		byte b11 = -57;
		char ce = (char)b11;  // developer is done
		System.out.println(ce);
		
		
	}
}
