package Nilam_FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFileAndFolderOnDiffLocation {
	public static void main(String[] args) throws IOException {
		//G:\file_Handling
		
		File f = new File("G:\\file_Handling\\New");
		f.mkdir();
		File f1 = new File ("G:\\file_Handling\\New\\abc.java");
		f1.createNewFile();
	}

}
