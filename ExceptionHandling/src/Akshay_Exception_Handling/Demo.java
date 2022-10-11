package Akshay_Exception_Handling;

import java.io.File;

public class Demo {
	
	public static void main(String[] args) throws Exception {
		
		System.out.println(">>> Start <<<");
		File f = new File ("avt.txt");
		f.createNewFile();
		System.out.println(">>> End <<<");
		
	}

}
