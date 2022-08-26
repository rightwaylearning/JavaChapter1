package refererance_variables;


class P{
	int a = 10;
	int b = 20;
}
class C extends P{
	int a = 100;
	int b = 200;
	
	void showPropetryValue() {
		System.out.println(a); // 100
		System.out.println(b);// 200
		System.out.println(this.a); // 100
		System.out.println(this.b); // 100;
		System.out.println(super.a); // 10
		System.out.println(super.b);// 20
	}
} 

public class PropetryOfClass {

	public static void main(String[] args) {
		// case1 
		P p= new P();
//		System.out.println(p.a); 10
//		System.out.println(p.b); 20
		
		// case 2
		C c= new C();
//		System.out.println(c.a); // 100
//		System.out.println(c.b);// 200
		c.showPropetryValue();
	}
}




class Test{
	
	int a;
	
	void m1(int a) {
		this.a =a;
	}
	
	
	public static void main(String[] args) {
		Test t = new Test();
		t.m1(100);
		System.out.println(t.a); 
	}
}













