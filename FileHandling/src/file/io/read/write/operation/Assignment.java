package file.io.read.write.operation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class Assignment {
	public static void main(String[] args) throws Exception {

		PrintWriter pw = new PrintWriter("file1.txt");
		pw.println(9876546789L);
		pw.println(7873448758L);
		pw.println(9346546789L);
		pw.println(9873454449L);
		pw.println(9345534549L);
		pw.close();
		
		pw = new PrintWriter("file2.txt");
		pw.println(3875848544L);
		pw.println(9993938758L);
		pw.println(2347823889L);
		pw.println(9873594544L);
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
