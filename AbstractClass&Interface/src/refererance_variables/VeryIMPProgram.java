package refererance_variables;

class SuperClass{
	int a = 99;
    void m1() {
    	System.out.println("Parent");
    }
} 
class SubClass extends SuperClass{
	int a = 999;
	  void m1() {
	    	System.out.println("child");
	  }
}


public class VeryIMPProgram {

	public static void main(String[] args) {
		SuperClass s = new SubClass();
		System.out.println(s.a);
		s.m1();
	}
}
