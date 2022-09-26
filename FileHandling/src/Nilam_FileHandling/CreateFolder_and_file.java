package Nilam_FileHandling;

import java.io.File;
import java.io.IOException;


public class CreateFolder_and_file {
	public static void main(String[] args) throws IOException {
		
		File f = new File ("Nilamdir");
		f.mkdir();
		System.out.println(f.getAbsolutePath());
		
		File f1 = new File("F:\\java july chapter 1\\JavaChapter1\\FileHandling\\Nilamdir\\nilam2.txt");
		f1.createNewFile();
	}

}
