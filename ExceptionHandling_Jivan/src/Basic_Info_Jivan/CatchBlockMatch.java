package Basic_Info_Jivan;

class A {
	void m1() {
		System.out.println("Hello good morning....");
	}
}

public class CatchBlockMatch {

	public static void main(String[] args) {
		A a = new A();
		int[] arr = { 10, 20, 30 };
		System.out.println("Program is start");
		try {
			a.m1();
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
			int r = 10 / 0;
			
		} catch (NullPointerException e) {
			System.out.println(e);
		
		} catch (ArithmeticException e) {
			System.out.println(e);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		
	    }catch (Exception e) {
		System.out.println(">>>>>>>>>>>>>");
		System.out.println(e);

		System.out.println("Thanks god! ! normal termination");
	}
}
}
