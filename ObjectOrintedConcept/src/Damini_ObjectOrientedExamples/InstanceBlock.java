package Damini_ObjectOrientedExamples;
class S
{
	{
         System.out.println("I m FirstInstance Block");
	}
	void m1()
	{
		System.out.println("I m Method block");
		}
	S()
	{
		System.out.println("I m Constuctor block");
	}
	{
		System.out.println("I m second Instance Block");
	}
	}
public class InstanceBlock {
public static void main(String[] args) {
	S s=new S();
	System.out.println("I m main method");
}
}
