package Damini_filehandling;

import java.io.File;

public class File_folderCreate {

	public static void main(String[] args)throws Exception{
		File dir=new File("new");
		dir.mkdir();
		System.out.println(dir.getAbsolutePath());
		File f=new File("E:\\java_july_2022\\JavaChapter1\\FileHandling\\new\\test.txt");
		boolean d=f.createNewFile();
		System.out.println(d);
		
	}
}
