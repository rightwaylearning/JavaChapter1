package Nilam_FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderDemo {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new FileReader("nilam1.txt"));
		
	String line	= br.readLine();
	
	while(line != null) {
		
		System.out.println(line);
		line = br.readLine();
		
	}
		br.close();
	}

}
