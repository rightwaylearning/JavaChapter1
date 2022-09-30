package Akshay_OperationOnFile;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferWriter_Demo {
	
	public static void main(String[] args) throws Exception {
		
		BufferedWriter bw = new BufferedWriter (new FileWriter ("merge.txt"));
		
		bw.write("Akshay");
		bw.newLine();
		
		bw.write("Sahil");
		bw.newLine();
		
		bw.write("Poonam");
		bw.newLine();
		
		bw.write("Nirmal");
		bw.newLine();
		
		bw.flush();
		bw.close();
		
	}

}
