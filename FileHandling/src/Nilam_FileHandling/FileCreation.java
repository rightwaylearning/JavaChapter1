package Nilam_FileHandling;

import java.io.File;
import java.io.IOException;

public class FileCreation {
	public static void main(String[] args) throws IOException {
		File f = new File("nilam.txt");
		boolean status = f.createNewFile();
		System.out.println(status);
		String path = f.getAbsolutePath();
		System.out.println(path);
	}

}
