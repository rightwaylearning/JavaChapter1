package Operation.on.file;

import java.io.File;

public class CreateFileAndFolderOnDiffLocation {

	public static void main(String[] args) throws Exception {
		// H:\FilehandlingFolders
		
		File f = new File("H:\\FilehandlingFolders\\MY_PROGRAMS");
		f.mkdir();
		File f1 = new File("H:\\FilehandlingFolders\\MY_PROGRAMS\\resume.pdf");
		f1.createNewFile();
	}
}
