package MethodOverrideingWRTThrowsKeyWord_Jivan;

class A {
	void m1() {
	}
}

class B extends A {

	@Override
	void m1() throws ArrayIndexOutOfBoundsException {
		int[] i = {};
		System.out.println(i[10]);
	}
}

public class Controller {

	public static void main(String[] args) {
		
		
		
	}
}
