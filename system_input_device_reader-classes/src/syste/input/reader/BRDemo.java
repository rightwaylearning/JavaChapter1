package syste.input.reader;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BRDemo {

	public static void main(String[] args) throws Exception {
		
		InputStreamReader  i = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(i);
		
		System.out.println("Enter first number input");
		String num1 = br.readLine();
		
		System.out.println("Enter second number input");
		String num2 = br.readLine();
		
		System.out.println(Integer.parseInt(num1) +  Integer.parseInt(num2));
		
		
				
	}
}
