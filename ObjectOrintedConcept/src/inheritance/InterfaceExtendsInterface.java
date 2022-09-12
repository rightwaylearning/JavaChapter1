package inheritance;

interface A1{
	void m1();
}
interface B1{
	void m1();
}

interface G1 extends A1,B1{
}


public class InterfaceExtendsInterface implements G1 {

	@Override
	public void m1() {
       System.out.println("I am main class method");		
	}

	public static void main(String[] args) {
		 A1 a= new InterfaceExtendsInterface();
		 a.m1();
		 B1 b= new InterfaceExtendsInterface();
		 b.m1();
		 G1 g= new InterfaceExtendsInterface();
		 g.m1();
	}
}
