package Damini_ObjectOrientedExamples;

public class Has_A_Relation {

	public void method1()
	{
		System.out.println("no args ");
	}
	public void method1(int i)
	{
		System.out.println("int args ");
	}

	public void method1(String s)
	{
		System.out.println("string args ");
	}

	public void method1(Object o)
	{
		System.out.println("object args ");
	}

	public void method1(int i,float f)
	{
		System.out.println("int float args ");
	}
	public static void main(String[] args) {
		Has_A_Relation h=new Has_A_Relation();
		h.method1();
		h.method1(10);
		h.method1(20);
		h.method1("damini");
		h.method1(30, 2.5f);
		System.out.println(h);
	}

}
