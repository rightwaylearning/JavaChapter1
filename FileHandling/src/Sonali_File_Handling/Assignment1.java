package Sonali_File_Handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class Assignment1 {
	public static void main(String[] args) throws Exception{
		PrintWriter pw = new PrintWriter("file1.txt");
		pw.println(8805207024L);
		pw.println(9146776203L);
		pw.println(7666933498L);
		pw.println(9604964534L);
		pw.println(9345534549L);
		pw.close();
		
		pw = new PrintWriter("file2.txt");
		pw.println(3875467544L);
		pw.println(9993938758L);
		pw.println(2536883989L);
		pw.println(9467964832L);
		pw.println(9384574449L);
		pw.close();
		
		PrintWriter merge = new PrintWriter("merge.txt");
		BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
		String line1 =  br.readLine();
		
		while(line1 != null) {
			merge.println(line1);
			line1 = br.readLine();
		}
		br.close();
		BufferedReader br1 = new BufferedReader(new FileReader("file2.txt"));
        String line2 =  br1.readLine();
		
		while(line2 != null) {
			merge.println(line2);
			line2 = br1.readLine();
		}
		br1.close();
		merge.close();
	}

}
