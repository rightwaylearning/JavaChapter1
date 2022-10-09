package Damini_filehandling;

import java.io.File;

public class differentloctaiononfile_folder {

	public static void main(String[] args)throws Exception {
		
		File f=new File("E:\\FileHandling\\My_jobs");
		f.mkdir();
		File f1=new File("E:\\FileHandling\\My_jobs\\damini.doc");
		f1.createNewFile();
	}
}
