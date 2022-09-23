package Sonali_File_Handling;

import java.io.File;

public class CreateFolderInDiffLocation {
	public static void main(String[] args) throws Exception{
		File f = new File("D:\\JavaChapter1\\FileHandling\\Sonali_Folder\\resume.pdf");
	
		f.createNewFile();
		System.out.println(f);
		
	}

}
