package damini_AbstactclassInterface;

import java.util.ArrayList;

public class demoExample {

	Object o;
	String s;
	ArrayList al;
	int a;
	int b;
	Class c;
	
	public static void main(String[] args) {
		
	  A a=null;
	  a=new A();
	  
	 // B b=new B(); CE AbstactClass
	  B b =null;
	}

}

class A {
	void m1()
	{
		
	}
	void m2()
	{
		
	}
	
abstract class B{
	int a;
	
	B()
	{
		a=10;
	}
	void m1()
	{
		
	}
	abstract void m2();
	
}
interface d
{
	int x=20;
	final static int c=30;
	public final static int s=40;
	
	public void m1();
	abstract public void m2();
	abstract void m3();
	
	
	}
abstract class h

{
	void m1() {}
	void m2() {}
	}


}
