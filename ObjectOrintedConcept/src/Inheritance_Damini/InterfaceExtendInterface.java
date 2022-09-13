package Inheritance_Damini;


interface A
{
	void m1();
	}
interface B
{
	void m1();
	}
interface C extends A,B
{
	
	}
public class InterfaceExtendInterface implements C
{
	
@Override
	public void m1() {
		System.out.println("main class");
		
	}

public static void main(String[] args) {
	A a=new InterfaceExtendInterface();
	a.m1();
	B b=new InterfaceExtendInterface();
	b.m1();
	C c=new InterfaceExtendInterface();
	c.m1();
	
}
}
