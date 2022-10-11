package Damini_ObjectOrientedExamples;
class R
{
	R()
	{
		System.out.println("I m Constructor");
	}
	{
	System.out.println("First Instance block");
	}
	void m1()
	{
		System.out.println("I m method block");
	}
	{
		System.out.println(" I m Second Instance Block");
	}
	
}
public class exInstanceBlock {
	public static void main(String[] args) {
		R r=new R();
		r.m1();
		System.out.println("I m main method");
		
	}

	}
