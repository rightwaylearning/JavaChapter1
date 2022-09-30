package Akshay_Assignments;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class RectifiedAssignment_26092022 {
	
	public static void main(String[] args) throws Exception {
		
		PrintWriter pw = new PrintWriter ("File1.txt");
		
		pw.println("9673717091");
		pw.println("9028749589");
		pw.println("9878458521");
		pw.println("8596741265");
		pw.println("8844552269");
		pw.close();
		
		pw = new PrintWriter ("File2.txt");
		pw.println("9585748596");
		pw.println("9585967496");
		pw.println("9585415296");
		pw.println("9532658596");
		pw.println("9545127496");
		pw.println("9542156596");
		pw.close();
		
		PrintWriter merge = new PrintWriter ("Merge.txt");
		BufferedReader br = new BufferedReader (new FileReader("File1.txt"));
		String Line1 = br.readLine();
		
		while (Line1 != null) {
			merge.println(Line1);
			Line1 = br.readLine();
		}
		br.close();
		
		BufferedReader br1 = new BufferedReader (new FileReader ("File2.txt"));
		String Line2 = br1.readLine();
		
		while (Line2 != null) {
			
			merge.println(Line2);
			Line2 = br1.readLine();
		}
		br1.close();
		merge.close();
		
	}

}
