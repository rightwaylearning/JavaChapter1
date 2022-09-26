package file.io.read.write.operation;

import java.io.File;
import java.io.FileReader;

public class FileReaderDemo {

	public static void main(String[] args) throws Exception {
		
		File f = new File("abc.txt");
		
		FileReader fr = new FileReader(f);
		
		int i = fr.read();
		
		while(i != -1) {
			System.out.print((char)i);
			i = fr.read();
		}
		fr.close();
		
		File f1 = new File("abc.txt");
		FileReader fr1 = new FileReader(f1);
		
		int len = (int)f.length();
		char[] arr = new char[len];
		
		fr1.read(arr);
		
		for(char ch :arr) {
			System.out.print(ch);
		}
		
		fr1.close();
	}
}
