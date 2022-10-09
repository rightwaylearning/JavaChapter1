package Sonali_File_Handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class PrintWriterDemo1 {
	public static void main(String[] args) throws Exception{
		
		PrintWriter pw = new PrintWriter("sonali1.txt");
		
		PrintWriter pw1 = new PrintWriter("sonali2.txt");
		
		PrintWriter pw3 = new PrintWriter("sonali3.txt");
		
		BufferedReader br = new BufferedReader(new FileReader("sonali1.txt"));
		BufferedReader br1 = new BufferedReader(new FileReader("sonali2.txt"));
		String line1=br.readLine(); 
		String line2=br1.readLine(); 
		while(line1!=null||line2!=null) 
		{
		if(line1!=null) 
		{
		pw.println(line1); 
		line1=br.readLine(); 
		}
		if(line2!=null) 
		{
		pw.println(line2); 
		line2=br1.readLine(); 
		
		}
		pw.flush();
		pw1.flush();
		pw3.flush(); 
		br.close(); 
		br1.close(); 
		pw.close();
		pw1.close();
		pw3.close();
		
	}

	}
}
