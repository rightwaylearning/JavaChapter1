package Nilam_inheritance;

interface A1{
	void m1();
}
interface B1{
	void m1();
	
}

class G2 implements A1,B1{

	@Override
	public void m1() {
		System.out.println("im g2 class method");
	}
	
}
public class MultipleInheritanceDemo  {
	public static void main(String[] args) {
	G2 g = new G2();
	}
	

}
