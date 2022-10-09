package SystemInputReader_Jivan;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BRDemo {
	
	public static void main(String[] args) throws Exception {
		
		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(i);
		
		System.out.println("Enter first number Input");
		String num1 = br.readLine();
		
		System.out.println("Enter second number Input");
		String num2 = br.readLine();
		
		System.out.println(Integer.parseInt(num1) + Integer.parseInt(num2));
	}

}
