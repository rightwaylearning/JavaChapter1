package Sonali_Oops_Examples;

class A{
	void m1(int a,int b) {
		System.out.println("int args method");
	}
	void m1(int x, float y) {
		System.out.println("Int-float args method");
	}
}
public class PolymorphismCase1 {
	
	public static void main(String[] args) {
		A a = new A();
		a.m1(10, 10);
		a.m1(2, 6.7f);
		
		byte b=10;
		a.m1(10, b);
	}

}
