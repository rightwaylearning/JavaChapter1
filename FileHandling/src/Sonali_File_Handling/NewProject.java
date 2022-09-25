package Sonali_File_Handling;

import java.io.File;

public class NewProject {
	
	public static void main(String[] args)throws Exception {
		
		File f = new File("D:\\JavaChapter1\\FileHandling\\MyFileHandlingFolder\\MyFileData.txt");
		f.createNewFile();
		System.out.println(f);
		System.out.println(f.getAbsolutePath());
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
	}

}
