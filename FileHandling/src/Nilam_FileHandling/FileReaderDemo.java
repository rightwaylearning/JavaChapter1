package Nilam_FileHandling;

import java.io.File;
import java.io.FileReader;

public class FileReaderDemo {
	public static void main(String[] args) throws Exception {
		File f = new File("Nilam123.txt");

		FileReader fr = new FileReader(f);

		int i = fr.read();
		while (i != -1) {
			System.out.print((char) i);
			i = fr.read();

		}
		fr.close();
	}

}
