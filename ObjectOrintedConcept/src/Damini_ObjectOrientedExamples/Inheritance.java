package Damini_ObjectOrientedExamples;


class A
{
	void m1()
	{
		System.out.println("I m m1() method");
	}
	}
class C extends A
{
	void m2()
	{
		System.out.println("I m m2() method");
	}
	}
public class Inheritance {
	public static void main(String[] args) {
		//case 1
		A a=new A();
		a.m1();
		
		//case 2
		C c=new C();
		c.m1();
		c.m2();
		//case 3
		A a1=new C();
		a1.m1();
		//case 4
		//C c1 =new P();  invalid case
	}

}
