package Operation.on.file;

import java.io.File;

public class FileCreation {

	public static void main(String[] args) throws Exception{
		
		File f = new File("abc.txt");
		boolean status = f.createNewFile();
		System.out.println("file creation status " + status);
		String path = f.getAbsolutePath();
		System.out.println(path);
		
	}
}
