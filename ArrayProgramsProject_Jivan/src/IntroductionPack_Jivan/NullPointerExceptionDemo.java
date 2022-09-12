package IntroductionPack_Jivan;

class A{
	int a;
	int b;
	
	void m1() {}
}

public class NullPointerExceptionDemo {
	
	public static void main(String[] args) {
		A obj = null;
		System.out.println(obj.a);
		System.out.println(obj.b);
		obj.m1();
	}
}
