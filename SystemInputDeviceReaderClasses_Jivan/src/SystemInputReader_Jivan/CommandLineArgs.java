package SystemInputReader_Jivan;

public class CommandLineArgs {
	
	public static void main(String[] args) {
		
	//	for(String string : args) {
	//		System.out.println(string);
	//	}
		
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		System.out.println(num1 + num2);
		
	}

}
