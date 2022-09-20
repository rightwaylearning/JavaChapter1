package method.overriding;

class A{}
class B extends A{}
class T{}
class P {
	 private Number m1(Number n) {
		System.out.println("parent");
		return null;
	}
	 
}

// public > protected > default > private
class C extends P {

	  private Double m1(Number n) {
		System.out.println("Child");
		return null;
	}
}

public class Controller {
	public static void main(String[] args) {
     //   P p= new C();  p.m1(10);
	}
}
