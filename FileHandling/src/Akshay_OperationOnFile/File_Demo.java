package Akshay_OperationOnFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class File_Demo {
	
	public static void main(String[] args) throws IOException {
		
//		File f = new File ("Akshay.text");
//		boolean c = f.exists();
//		System.out.println(c);
//		System.out.println("Akshay.text path = "+f.getAbsolutePath());
//		//D:\Java project july2022\JavaChapter1\FileHandling\Akshay.text
//		
//		f.createNewFile();
//		c = f.exists();
//		System.out.println(c);
//		
//		File f1 = new File ("Akshay.java");
//		if (!f1.exists()) {
//			f1.createNewFile();
//		}
//		System.out.println("Akshay.java path = "+f1.getAbsolutePath());
//		//D:\Java project july2022\JavaChapter1\FileHandling\Akshay.java
//		
		File f2 = new File ("Akshay_Assignment_26092022");
		if(!f2.exists()) {
			f2.mkdir();
		}
//		System.out.println("Akshay_Projects path = "+f2.getAbsolutePath());
		//D:\Java project july2022\JavaChapter1\FileHandling\Akshay_Assignment_26092022

//---------------------------------------------------------------------------------------------------
		// Assignment
		
		File F5 = new File(f2, "File_3.txt");
		F5.createNewFile();
		System.out.println(F5.exists());
		
		
		File f3 = new File(f2, "File_1.text");
		f3.createNewFile();
		System.out.println(f3.exists());
		
		File f4 = new File (f2, "File_2.text");
		f4.createNewFile();
		System.out.println(f4.exists());
		
		PrintWriter pw = new PrintWriter("File_3.text");
		
		BufferedReader br = new BufferedReader (new FileReader("File_1.txt"));
		
		String line = br.readLine();
		
		while (line != null) {
			
			pw.println(line);
			line = br.readLine();
		}
		
		BufferedReader br1 = new BufferedReader (new FileReader("File_2.txt"));
		
		line = br1.readLine();
		
		while (line != null) {
		
		pw.println(line);
		line = br1.readLine();
		}
		
		pw.flush();
		br.close();
		br1.close();
		pw.close();
		
		System.out.println("Merged file_1.txt and file_2.txt into file3.txt");
	}

}
	