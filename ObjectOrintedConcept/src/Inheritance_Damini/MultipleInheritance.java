package Inheritance_Damini;

interface S
{
	void m1();
	
	}
interface R
{
	void m1();
	}
class Q implements S,R
{
	public void m1()
	{
		System.out.println("I m from S");
	}
	}
public class MultipleInheritance {

	public static void main(String[] args) {
		S s=new S();
		s.m1();
		R r=new R();
		r.m1();
		Q q=new Q();
		q.m1();
		}
}
