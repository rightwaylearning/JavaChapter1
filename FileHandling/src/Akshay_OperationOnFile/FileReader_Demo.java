package Akshay_OperationOnFile;

import java.io.File;
import java.io.FileReader;

public class FileReader_Demo {

	public static void main(String[] args) throws Exception {
		
		File fr = new File ("merge.txt");
		
		FileReader f1 = new FileReader (fr);
		int i = f1.read();
		
		while (i != -1) {
			System.out.print(i);
			i = f1.read();
		}
		f1.close();
	}
}
