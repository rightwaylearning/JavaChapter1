package Nilam_FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFolder {
	public static void main(String[] args) throws IOException {
		File f = new File("my dir");
		f.mkdir();
		  File f1 = new File("nilam1.txt");
	       f1.createNewFile();
	        
	        System.out.println(f.isFile());  // false
	        System.out.println(f.isDirectory()); // true
	        System.out.println(f1.isFile()); //true
	        System.out.println(f1.isDirectory()); // false
			
	}

}
