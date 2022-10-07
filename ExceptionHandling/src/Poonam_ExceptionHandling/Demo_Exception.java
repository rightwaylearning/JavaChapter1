package Poonam_ExceptionHandling;

import java.io.File;
import java.io.IOException;

public class Demo_Exception {

	public static void main(String[] args) {
		
		File f1=new File("Po.txt");
		try {
			f1.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
