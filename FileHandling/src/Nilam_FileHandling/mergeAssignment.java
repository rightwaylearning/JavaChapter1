package Nilam_FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class mergeAssignment {
	public static void main(String[] args) throws Exception {

		PrintWriter pw = new PrintWriter("advik1.txt");
		pw.println(7878996660L);
		pw.println(7822434533L);
		pw.println(8896789575L);
		pw.println(7753636660L);
		pw.println(9954535660L);
		pw.println(3666542460L);
		pw.println(4987877660L);
		pw.close();

		PrintWriter pw1 = new PrintWriter("advik2.txt");
		pw1.println(7766889954L);
		pw1.println(6789949954L);
		pw1.println(7766888877L);
		pw1.println(9077689954L);
		pw1.println(8557779954L);
		pw1.println(7766877754L);
		pw1.println(7775589954L);
		pw1.println(7646689954L);
		pw1.close();

		PrintWriter merge = new PrintWriter("Amerge.txt");

		BufferedReader br1 = new BufferedReader(new FileReader("advik1.txt"));
		String line = br1.readLine();

		while (line != null) {
			merge.println(line);
			line = br1.readLine();
		}
		br1.close();

		BufferedReader br2 = new BufferedReader(new FileReader("advik2.txt"));

		String line1 = br2.readLine();
		while (line1 != null) {
			merge.println(line1);
			line1 = br2.readLine();
		}

		br2.close();
		merge.close();
	}

}
