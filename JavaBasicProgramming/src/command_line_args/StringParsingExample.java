package command_line_args;

public class StringParsingExample {

	public static void main(String[] args) {
		
		String[] data = new String[2];

		data[0] = "2";
		data[1] = "4";

		int num1 = Integer.parseInt(data[0]);

		int num2 = Integer.parseInt(data[1]);

		System.out.println(num1 + num2);

	}
}
