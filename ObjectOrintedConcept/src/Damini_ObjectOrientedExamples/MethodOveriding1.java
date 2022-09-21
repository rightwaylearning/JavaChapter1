package Damini_ObjectOrientedExamples;
class D{}
class B extends D{}
class T{}
class P{
	
	private Number m1(Number n)
	{
		System.out.println("Parent");
		return null;
	}
	
}
class C extends P
{
	private Double m1(Number n)
	{
		System.out.println("Child");
		return null;
	}
	
}

public class MethodOveriding1 {
public static void main(String[] args) {
	P p=new P();
	//p.m1(10);	
}
}
