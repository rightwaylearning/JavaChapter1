package polymorphism_examples;

class D {

	void m1(Integer a) {
		System.out.println("I am Integer arg method");
	}

	void m1(byte b) {
		System.out.println("I am byte arg method");
	}

}

public class Case4MethoodOverlodding {

	public static void main(String[] args) {

		D d= new D();
		int a = 10;
		d.m1(a); // int  >> Integer
		
		byte bb= 10;
		Byte b= new Byte(bb);
		
		d.m1(b); // Byte ref  >>> byte
	}
}
