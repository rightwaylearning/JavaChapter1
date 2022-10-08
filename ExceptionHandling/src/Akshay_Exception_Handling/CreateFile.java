package Akshay_Exception_Handling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	
	public static void main(String[] args) {
		
		System.out.println(">>> Start <<<");
		File f = new File ("akshayfile.txt");
		try{
		f.createNewFile();
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println(">>> End <<<");
		
	}

}
