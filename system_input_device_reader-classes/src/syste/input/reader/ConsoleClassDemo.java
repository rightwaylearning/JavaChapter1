package syste.input.reader;

import java.io.Console;

public class ConsoleClassDemo {

	public static void main(String[] args) {
		System.out.println(">>>>>>>>>>>");
		Console c = System.console();
		String str = c.readLine();
		System.out.println(str);
	}
}
