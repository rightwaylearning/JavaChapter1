package Nilam_FileHandling;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		File f = new File("abc.txt");
		if(!f.exists()) {
			f.createNewFile();
			System.out.println(f.getAbsolutePath());
		}
		//F:\java july chapter 1\JavaChapter1\FileHandling\abc.txt
	}
     File f = new File ("");
}
