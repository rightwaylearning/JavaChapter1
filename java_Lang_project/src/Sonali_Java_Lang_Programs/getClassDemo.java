package Sonali_Java_Lang_Programs;

class D {
	D() {

	}

	D(int a, int b) {
	}

	void m1() {
	}

	void m2() {
	}
}

class getClassDemo {

	public static void main(String[] args) {
		D a = new D();
		Class obj = a.getClass();

		System.out.println(obj.getName());

	}
}
