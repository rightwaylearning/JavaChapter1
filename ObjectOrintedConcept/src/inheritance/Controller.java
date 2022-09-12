package inheritance;

interface A{
	void m1();
}

interface B{
	void m2();	
}

class Test implements A,B{
  public void m1() {
	  System.out.println("I am m1 from A interface");
  }	
  public void m2() {
	  System.out.println("I am m2 from B interface");
  }
}


public class Controller {

	public static void main(String[] args) {
		Test t= new Test();
		t.m1();
		t.m2();
		
		A a= new Test();
		a.m1();
		
		B b= new Test();
		b.m2();
	}
}
