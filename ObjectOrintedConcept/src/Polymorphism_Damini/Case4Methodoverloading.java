package Polymorphism_Damini;
class D
{
	void m1(Integer a)
	{
		System.out.println("I m int arg method");
	}
	void m1(byte b) {
		System.out.println("I m byte arg method");
	}
	}
public class Case4Methodoverloading {

	public static void main(String[] args) {
		D d=new D();
		int a=10;
		d.m1(a);
		
		byte b1=20;
		Byte b=new Byte(b1);
		d.m1(b);
		}
}
