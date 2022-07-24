package Damini_main;

public class Downcasting {
	
	public static void main(String[] args) {
		
		int n=10;
		
		byte b =(byte)n;//type casting
        System.out.println(b);
		
		int g=240;
		byte f=(byte)g;//byte range 127 to -128
		System.out.println(f); 
		
		int ch=65;
		char ch1=(char)ch;
		System.out.println(ch1);
		
		int ch2=655678;
		char ch3=(char)ch2;
		System.out.println(ch3);
		
		byte b1=-58;
		char d=(char)b1;
		System.out.println(d);

		
		
	}

}
