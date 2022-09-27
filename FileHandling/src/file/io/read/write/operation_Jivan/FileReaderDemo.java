package file.io.read.write.operation_Jivan;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderDemo {

	public static void main(String[] args) throws Exception {
		
		File f = new File("abc.txt");
		
		FileReader fr = new FileReader(f);
		
		int i = fr.read();
		 while(i != -1) {
			 System.out.println((char)i);
			 i = fr.read();
		 }
		 fr.close();
	}
}
