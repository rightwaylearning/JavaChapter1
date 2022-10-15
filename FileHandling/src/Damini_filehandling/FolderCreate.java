package Damini_filehandling;

import java.io.File;

public class FolderCreate {

	public static void main(String[] args)throws Exception{
		File f=new File("my_dir");
		f.mkdir();
		File f1=new File("My_file");
	 f1.createNewFile();
		
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
		System.out.println(f1.isFile());
		System.out.println(f1.isDirectory());
	}
}
