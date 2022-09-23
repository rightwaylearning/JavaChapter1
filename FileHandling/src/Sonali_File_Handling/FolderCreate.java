package Sonali_File_Handling;

import java.io.File;

public class FolderCreate {
	public static void main(String[] args) throws Exception {
		
		File f = new File("Sonali");
		f.mkdir();
		System.out.println(f);
		System.out.println(f.getAbsolutePath());
		boolean b = f.isDirectory();
		System.out.println(b);
		
	}

}
