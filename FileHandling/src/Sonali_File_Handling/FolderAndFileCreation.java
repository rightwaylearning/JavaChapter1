package Sonali_File_Handling;

import java.io.File;

public class FolderAndFileCreation {
	
	public static void main(String[] args) throws Exception{
		File f = new File("JAVA_PROGRAMS");
		f.mkdir();
		System.out.println(f);
		System.out.println(f.getAbsolutePath());
		
		
		File f1 = new File("D:\\JavaChapter1\\FileHandling\\JAVA_PROGRAMS//Addition.txt");
		f1.createNewFile();
		System.out.println(f1);
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		System.out.println(f1.isFile());
		System.out.println(f1.isDirectory());
		
	}

}
