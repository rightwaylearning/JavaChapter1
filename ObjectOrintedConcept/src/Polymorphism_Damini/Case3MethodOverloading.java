package Polymorphism_Damini;
class C
{
	void m1(int a,float b)
	{
		System.out.println("two args int,float");
	}
	void m2(float a,int b)
	{
		System.out.println("two args float,int");
	}
	}
public class Case3MethodOverloading {
public static void main(String[] args) {
	C c=new C();
	c.m1(10, 20f);
	c.m2(20f, 10);
	byte x=20;
	byte y=30;
	c.m1(x, y);
}
}
