package FileObjectOperations_24_09_2022;

import java.io.File;
import java.io.IOException;

public class FileClassMethods {

	public static void main(String[] args) throws IOException{
		
		 File f2 = new File("D:\\newtest\\test123.txt");
		 System.out.println(f2.createNewFile());
		 
		 File f3 = new File("D:\\newtest");
		 System.out.println(f3.mkdir());
		 
		 System.out.println(f2.isDirectory()); // false
		 System.out.println(f2.isFile()); // true
		 
		 System.out.println(f3.isDirectory()); /// true
		 System.out.println(f3.isFile());// false

	}
}
