package Nilam_FileHandling;

import java.io.File;
import java.io.FileWriter;

public class FileWriterDemo {
	public static void main(String[] args) throws Exception {

		File f = new File("Nilam123.txt");

		FileWriter fw = new FileWriter(f,true);

		fw.write(100);
		fw.write("\n");
		char[] ch = { 'a', 'b', 'c' };
		fw.write(ch);
		fw.write("\n");

		fw.write("hello good evening");
		fw.write("\n");
		fw.flush();
		fw.close();

	}

}
