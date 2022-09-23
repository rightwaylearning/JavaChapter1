package Sonali_File_Handling;

import java.io.File;

public class OperationOnFile {
	
	public static void main(String[] args) throws Exception {
		File f = new File("ABC.txt");
		f.createNewFile();
		boolean b=f.isFile();
		System.out.println(b);
		System.out.println(f);
		System.out.println(f.getAbsolutePath());
	}

}
