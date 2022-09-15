package Inheritance_Jivan;

interface P{
	void m1();
}

interface C{
	void m1();
}

class G implements P, C{
	public void m1() {
		System.out.println("I am from G");
	}
}

public class MultipleInheritanceDemo {
	
	public static void main(String[] args) {
		G g = new G();
		g.m1();
		
		C c = new G();
		c.m1();
		
		P p = new G();
		p.m1();
	}

}
