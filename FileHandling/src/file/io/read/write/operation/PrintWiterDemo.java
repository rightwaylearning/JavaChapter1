package file.io.read.write.operation;

import java.io.PrintWriter;

public class PrintWiterDemo {

	public static void main(String[] args) throws Exception{
		
		PrintWriter pw = new PrintWriter("newfile.txt");
		
		pw.write(100);
		pw.write("\n");
		pw.println(100);
		pw.println('d');
		pw.println("Hi hello How are you");
		pw.close();
		
	}	
		
}
