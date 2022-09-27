package file.io.read.write.operation;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderDemo {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
	   
		String line = br.readLine();
		while(line != null) 
		{
			System.out.println(line);
			line  = br.readLine();
		}
		br.close();
	}
}
