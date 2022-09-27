package Sonali_Java_Lang_Programs;
 class Parent{
	 int a;
	 int b;
	public Parent(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	@Override
	public int hashCode() {
		return this.a + this.b;
	}
	 
 }
public class ContractBetHashcodeAndToEquals {
	public static void main(String[] args) {
		Parent p = new Parent(10,20);
		Parent p1 = new Parent(30,20);
		Parent p2 = new Parent(10,10);
		Parent p3 = new Parent(10,20);
		Parent p4 = new Parent(40,20);
		Parent p5 = p;
		System.out.println(p.hashCode()==p1.hashCode());
		System.out.println(p.hashCode()==p2.hashCode());
		System.out.println(p.hashCode()==p3.hashCode());
		System.out.println(p.hashCode()==p4.hashCode());
		System.out.println(p.hashCode()==p5.hashCode());
		
	}

}
