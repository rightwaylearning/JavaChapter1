package Akshay_OperationOnFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class AssignmentClass {
	
	public static void main(String[] args)throws IOException {
		
//		File f2 = new File ("Akshay_Assignment_26092022");
//		if(!f2.exists()) {
//			f2.mkdir();
//		}
//		File F5 = new File(f2, "File_3.txt");
//		F5.createNewFile();
//		System.out.println(F5.exists());
//		
//		
//		File f3 = new File(f2, "File_1.txt");
//		f3.createNewFile();
//		System.out.println(f3.exists());
//		
//		File f4 = new File (f2, "File_2.txt");
//		f4.createNewFile();
//		System.out.println(f4.exists());
		
		PrintWriter pw = new PrintWriter("File_3.txt");
		
		BufferedReader br = new BufferedReader (new FileReader("File_1.txt"));
		
		String line = br.readLine();
		
		while (line != null) {
			
			pw.println(line);
			line = br.readLine();
		}
		
		br = new BufferedReader (new FileReader("File_2.txt"));
		
		line = br.readLine();
		
		while (line != null) {
		
		pw.println(line);
		line = br.readLine();
		}
		
		pw.flush();
		br.close();
		pw.close();
		
		System.out.println("Merged file_1.txt and file_2.txt into file3.txt");
	}
}	
