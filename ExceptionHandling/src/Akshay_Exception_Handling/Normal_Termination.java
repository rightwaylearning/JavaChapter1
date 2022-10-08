package Akshay_Exception_Handling;

class A {

	void m1() {
		System.out.println("Hello Good Morning");
	}

}

public class Normal_Termination {

	public static void main(String[] args) {
		
		A a = new A();
		int [] arr = {10,20,30,40,50}; // size is 5 & Index size is 4
		System.out.println("Program is Start");
		
		try {
			
			a.m1();
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
			
			int r = 10/0;
		}
//		catch (NullPointerException e) {
//			System.out.println(e);
//			
//		} catch (ArithmeticException e) {
//			System.out.println(e);
//			
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println(e);
//			
//		} 
		catch (Exception e) {
			System.out.println(e);
//			System.out.println(e);
//			System.out.println(e);
		}
		System.out.println("thanks god!! normal termination");
	}
}
