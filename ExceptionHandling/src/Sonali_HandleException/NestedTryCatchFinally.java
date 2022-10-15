package Sonali_HandleException;

public class NestedTryCatchFinally {
	public static void main(String[] args) {
		try {
			System.out.println("Line 1");
			System.out.println("Line 2" + 10/0);
			System.out.println("Line 3");
			System.out.println("Line 4");
			try {
				System.out.println("Line 5");
				System.out.println("Line 6" );
				System.out.println("Line 7");
				System.out.println("Line 8");
			} catch (NullPointerException e) {
				System.out.println("line 9");
			} finally {
				System.out.println("First  final block excuted");
			}
			System.out.println("Line 10");
		} catch (Exception e) {
			System.out.println("Exception Occured");
		} finally {
			System.out.println("Second final block excuted");
		}
		System.out.println("line 11");
		System.out.println("end of the Program");
	}

}