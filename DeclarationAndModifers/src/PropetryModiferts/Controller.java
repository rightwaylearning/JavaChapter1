package PropetryModiferts;

public class Controller {

	public static void main(String[] args) {
		Student s = new Student();
		Test t= new Test(10,s,"abc");
		
		Test t1= new Test(100,new Student(),"lmn");
		
		//t1.str = "";
		
		Employee e  = Employee.getObject();
		
		e.m1();
		
	}
}



 class A{
	void m1() {
		
	}
	
	native void m2();
}

class B extends A{
	
	void m2() {
		 int a = 10;
		
	}
	
	void m1() {
		
	}
}
















