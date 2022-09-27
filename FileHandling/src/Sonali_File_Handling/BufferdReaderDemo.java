package Sonali_File_Handling;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferdReaderDemo {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("Data.txt"));
		String line = br .readLine();
		while(line != null) {
			System.out.println(line);
			line=br.readLine();
			
			
		}
		br.close();
		
	}

}
