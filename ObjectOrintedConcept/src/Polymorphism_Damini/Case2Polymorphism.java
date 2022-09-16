package Polymorphism_Damini;

class B
{
	void m1(int a)
	{
		System.out.println("int args");
	}
	void m1(short s)
	{
		System.out.println("short args");
	}
	void m1(double d)
	{
		System.out.println("double args");
	}
	void m1(char ch)
	{
		System.out.println("char args");
	}
	}
public class Case2Polymorphism {
public static void main(String[] args) {
	 B b=new B();
	 
	 byte y=101;
	 b.m1(y);
	 
	 long l=786905L;
	 b.m1(l);
	 
	 b.m1('a');
}
}
