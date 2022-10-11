package Sonali_HandleException;

public class NestedTryCatch {
	public static void main(String[] args) {
		try {
			System.out.println("statement1");
			System.out.println("statement2");
			System.out.println("statement3");
			try {
				System.out.println("statement4");
				System.out.println("statement5");
				System.out.println("statement6");
			} catch (ArithmeticException e) {
				System.out.println("statement7");
			} finally {
				System.out.println("statement8");
			}
			System.out.println("statement9");
		} catch (NullPointerException e) {
			System.out.println("statement10");
		} finally {
			System.out.println("statement11" + 10 / 0);
		}
		System.out.println("statement12");
	}

}
