package Sonali_File_Handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class PrintWriterDemo {
	public static void main(String[] args) throws Exception{
		PrintWriter p = new PrintWriter("PrintFile.txt");
		p.println("Good Morning");
		p.println("hellooo");
		p.println("hiiii");
		p.close();
		
		BufferedReader br = new BufferedReader(new FileReader("PrintFile.txt"));
		String str = br.readLine();
		while(str != null) {
			System.out.println(str);
			str = br.readLine();
			
		}
		br.close();
	}

}
