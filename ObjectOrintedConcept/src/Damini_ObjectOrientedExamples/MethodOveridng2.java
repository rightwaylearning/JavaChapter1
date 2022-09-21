package Damini_ObjectOrientedExamples;
class E
{}
class F extends E
{

	}
class T1
{
	Number m1(Number n)
	{
		System.out.println("Parent");
		return null;
	}
	
	}
class G extends T1

{
	public Double m1(Number n)
	{
		System.out.println("child");
		return null;
	}
	}

public class MethodOveridng2 {

	public static void main(String[] args) {
		T1 t=new G();
		t.m1(10);
	}
}
