package Polymorphism_Damini;

class A
{
	void  B1()
	{
		System.out.println("Zero Args");
	}
	void B1(int a)
	{
		System.out.println("One args");
	}
	void B1(int a,float b,int c)
	{
		System.out.println("Three arges int,float,int");
	}
	void B1(float a,int b)
	{
		System.out.println("two args float,int");
	}
	}
public class Case1MethodOverloading {

	public static void main(String[] args) {
		A a=new A();
		a.B1();
		a.B1(10);
		a.B1(10, 30f, 40);
		a.B1(20f, 12);
		
	}
}
