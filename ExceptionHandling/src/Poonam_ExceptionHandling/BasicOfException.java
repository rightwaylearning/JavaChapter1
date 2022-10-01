package Poonam_ExceptionHandling;

import java.io.File;

public class BasicOfException {

	public static void main(String[] args) throws Exception {
		
	       System.out.println("******* Creating File ********");	
		   File f = new File("ab.txt");
		   f.createNewFile();
		   System.out.println("******* End Procedure ******* ");
	}
}
