package Sonali_File_Handling;

import java.io.File;
import java.io.FileWriter;
import java.io.FilterWriter;

public class Assignment26_9_22 {
	
	public static void main(String[] args)throws Exception {
		File f = new File("FirstFile.txt");
		f.createNewFile();
		System.out.println(f);
		System.out.println(f.getAbsolutePath());
		FileWriter fr = new FileWriter(f);
		fr.write("FirstFile");
	}

}
