package Damini_Abstact_Modifier;

public class Controller {

	class A{
		void m1()
		{
			System.out.println("Land,flat");
			
		}
		
		
	}
	class B extends A
	{
		void m1()
		{
			System.out.println("Land,shop");
		}
		void d1()
		{
			System.out.println("I m D1 method of class A");
		}
	}
	abstract class parent {
		void Land()
		{
			
		}
		abstract void home();
			
		
		
	}
	class Child extends parent
	{
		void home()
		{
		 System.out.println("home");
		}
	}
	interface S
	{
		public void Land();
		public void home();
		
	}
	class F implements S
	{
		
		public void Land() {
			System.out.println("Land");
			
		}
		public void home()
		{
			System.out.println("home");
		}
	}
	public static void main(String[] args) {
		{
			B b=new B();
			b.m1();
			b.d1();
			Child ch=new Child();
			ch.home();
			ch.Land();
			F f=new F();
			f.Land();
			f.home();
			
					
		}
	}
}
