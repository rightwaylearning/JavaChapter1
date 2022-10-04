package Nilam_FileHandling;

import java.io.PrintWriter;

public class PrintWiterDemo {
	public static void main(String[] args) throws Exception {
		
		PrintWriter pw = new PrintWriter("advik.txt");
		
		pw.println('D');
		pw.println(10.10f);
		pw.println("hello");
	
		pw.close();
	}

}
