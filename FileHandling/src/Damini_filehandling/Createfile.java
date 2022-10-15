package Damini_filehandling;

import java.io.File;

public class Createfile {

	public static void main(String[] args)throws Exception {
		
		File f=new File("sts.txt");
		boolean status=f.createNewFile();
		System.out.println("file creation status" +status);
		String path=f.getAbsolutePath();
		System.out.println(path);
		
	}
}
