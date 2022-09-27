package Akshay_OperationOnFile;

import java.io.File;

public class CreateFileAndFolderOnDiffLocation {
	
	public static void main(String[] args) throws Exception {
		
		File f = new File ("D:\\FilehandlingFoldersAkshay\\MY_PROGRAMS");
		f.mkdir();
		
		File f1 = new File ("D:\\\\FilehandlingFolders\\\\MY_PROGRAMS\\\\resume.pdf");
		f1.createNewFile();
		
	}

}
