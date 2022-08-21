package Damini;

public class Sample extends Test{
	void m2()
	{
		System.out.println("I m sample class");
	}
	

}
class A{
	
	void m1()
	{
		
	}
}
class B extends A
{
	void m2()
	{
		
	}
	public static void main(String[] args) {
		A a=new A();
		a.m1();
		//a.m2(); C.E
		B b=new B();
		b.m2();
		b.m1();
	
	}
	
	}

