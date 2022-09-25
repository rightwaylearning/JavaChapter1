package Nilam_inheritance;




interface A{
void m1();
}
interface B {
	void m2 ();

}

interface G extends A,B{
	
	
}
public class InterfaceExtendsInterface implements G{
	
	
	@Override
	public void m1() {
		System.out.println("i am iterface A method");
		
	}

	@Override
	public void m2() {
		System.out.println("i am interface B method ");
		
		
	}
	public static void main(String[] args) {
		A a = new InterfaceExtendsInterface();
		a.m1();
		B b = new InterfaceExtendsInterface();
		b.m2();
		G g = new InterfaceExtendsInterface();
		g.m1();
		g.m2();
	}

}
