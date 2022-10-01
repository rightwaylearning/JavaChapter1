package Akshay_OperationOnFile;

import java.io.File;
import java.io.FileWriter;

public class FileWriter_Demo {

	public static void main(String[] args) throws Exception {
		
		File f = new File("merge.txt");
		
		FileWriter f1 = new FileWriter (f);
		
		f1.write("Poonam Jadhav\n");
		f1.write("Akshay Tejale\n");
		f1.write("Sahil Bagade\n");
		f1.write("Nirmal Rajput\n");
		
		f1.flush();
		f1.close();
		
		
		
	}
}
