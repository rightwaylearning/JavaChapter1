package basic.info;

class A {
	void m1() {
		System.out.println("hello God morning....");
	}
}

public class catchBlockMatch {
	public static void main(String[] args) {
		A a = new A();
		int[] arr = { 10, 20, 30 }; // 3 >> 0 to 2
		System.out.println("program is start");
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
		} catch (Exception e) {
			System.out.println(e);
			System.out.println(e);  // second line
			System.out.println(e);  // third line
		}
		
		System.out.println("thanks god!! normal termination");
	}
}
