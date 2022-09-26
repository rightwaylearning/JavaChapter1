package Sonali_File_Handling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileWriterAssignment {
public static void main(String[] args)throws Exception {
	File f = new File("FirstFileDemo.txt");
	FileWriter fr = new FileWriter(f);
	
	fr.write("8805207024");
	
	
	fr.flush();
	fr.close();
	
	File f1 = new File("FirstFileDemo.txt");
	FileReader f2 = new FileReader(f1);

	int len = (int)f.length();
	char[] arr = new char[len];
	
	f2.read(arr);
	
	for(char ch :arr) {
		System.out.print(ch);
	}
	f2.close();
	/* int i=f2.read();
	while(i != -1) {
		System.out.print((char)i);
		i = f2.read();
	}
	f2.close();
	*/
	
}


}

	