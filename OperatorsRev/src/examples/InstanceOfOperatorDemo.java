package examples;

import java.util.ArrayList;

public class InstanceOfOperatorDemo {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList<>();
		al.add(new A());
		al.add(new B());
		al.add(new C());
 
		 for (Object o : al) {
			
			 if(o instanceof C) {
				 C c = (C)o;
				 c. m3();
			 }
			 
		}
		
		
	}

}

class A{
	void m1() {
		System.out.println("I am m1 method of A class");
	}
}

class B{
	void m2() {
		System.out.println("I am m3 method of B class");
	}
}

class C{
	void m3() {
		System.out.println("I am m3 method of C class");
	}
}