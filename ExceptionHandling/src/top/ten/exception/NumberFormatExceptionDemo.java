package top.ten.exception;

public class NumberFormatExceptionDemo {

	public static void main(String[] args) {
		String str = "thirty";
		
		int i = Integer.parseInt(str);
		System.out.println("done .. "+ i);
	}
}
