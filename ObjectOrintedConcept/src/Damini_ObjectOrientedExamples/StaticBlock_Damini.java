package Damini_ObjectOrientedExamples;
class staticblockEx
{
	static
	{
		System.out.println("I m First Block");
	}
	staticblockEx()
	{
		System.out.println("I m Construtor");
		
	}
	static
	{
		System.out.println("I m Second Static Block");
	}
	{
		System.out.println("I m Intance Block");
	}
	}
public class StaticBlock_Damini {

	public static void main(String[] args) {
		staticblockEx e=new staticblockEx();
		System.out.println("I m main method");
	}
}
