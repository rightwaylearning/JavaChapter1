package Damini_filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class FileAssignment {

	public static void main(String[] args)throws Exception {
		PrintWriter pr=new PrintWriter("Test1.txt");
		pr.println(6247384793L);
		pr.println(7832274039L);
		pr.println(8754390584L);
		pr.println(7485784845L);
		pr.close();
		
		pr=new PrintWriter("Test2.txt");
		pr.println(8747847584L);
		pr.println(7886478734L);
		pr.println(7684854884L);
		pr.println(6526326633L);
		pr.close();
		
		PrintWriter merge=new PrintWriter("merge.txt");
		BufferedReader br=new BufferedReader(new FileReader("Test1.txt"));
		String ln=br.readLine();
		while(ln!=null)
		{
			merge.println(ln);
			ln=br.readLine();
		}br.close();
		BufferedReader br1=new BufferedReader(new FileReader("Test2.txt"));
		String ln1=br1.readLine();
		
		while(ln1!=null)
		{
			merge.println(ln1);
			ln1=br1.readLine();
		}br1.close();
		merge.close();
	}
}
