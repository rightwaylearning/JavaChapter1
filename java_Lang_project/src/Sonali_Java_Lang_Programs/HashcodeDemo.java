package Sonali_Java_Lang_Programs;
class P{
	int a , b ;

	public P(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	@Override
	public int hashCode() {
		return this.a + this.b;
	}
}
public class HashcodeDemo {
	
	public static void main(String[] args) {
		P p = new P(20,40);
		P p1 = new P(20,40);
		P p2 = new P(40,40);
		P p3 = new P(90,40);
		P p4 = p1;
		System.out.println(p.hashCode()==p1.hashCode());
		System.out.println(p.hashCode()==p2.hashCode());
		System.out.println(p.hashCode()==p3.hashCode());
		System.out.println(p.hashCode()==p4.hashCode());
		System.out.println(p1.hashCode()==p4.hashCode());
		
		
	}

}
