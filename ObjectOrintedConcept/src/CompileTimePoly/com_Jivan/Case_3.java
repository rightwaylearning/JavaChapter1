package CompileTimePoly.com_Jivan;

class C{
	void m1(int a, int b) {
		System.out.println("int, int");
	}
	
	void m1(float a, float b) {
		System.out.println("float, float");
	}
		
	void m1(float a, int b) {
			System.out.println("float, int");
		}
	
	void m1(int a, float b) {
		System.out.println("int, float");
	}
}
public class Case_3 {
	
	public static void main(String[] args) {
		C c = new C();
	//	c.m1(0, 0);
	//	c.m1(0.0f, 0.0f);
		c.m1(0.0f, 0);
		c.m1(0, 0.0f);
	
		c.m1(0, 0);
	}

}
