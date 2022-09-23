package Operation.on.file;

import java.io.File;

public class CreateFolder_and_file {

	public static void main(String[] args) throws Exception {
		
		
		File dir = new File("NEW");
		dir.mkdir();
		System.out.println(dir.getAbsolutePath());
		
		File f = new File("H:\\JavaChapter1JulyBatch\\JavaChapter1\\FileHandling\\NEW\\test.txt");     
	    boolean s = f.createNewFile();
	    System.out.println(s);
	}
}
