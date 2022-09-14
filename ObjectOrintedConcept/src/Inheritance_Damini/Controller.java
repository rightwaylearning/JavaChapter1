package Inheritance_Damini;
interface A1
{
	void m1();
	}
interface B1
{
	void m2();
	}
class Test implements A1,B1
{
	public void m1()
	{
		System.out.println("im m1 from A interface");
	}
	public void m2()
	{
		System.out.println("Im m2 from B interface");
	}
	}
public class Controller {
public static void main(String[] args) {
	Test t=new Test();
	t.m1();
	t.m2();
	
	A1 a=new Test();
	a.m1();
	
	B1 b=new Test();
	b.m2();
	
}
}
