package test.sample;

class A{
	int a,b;
	A(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	@Override
	public int hashCode() {
		return this.a + this.b;
	}
}
public class HashCodeDemo {

	public static void main(String[] args) {
	
		A a= new A(10,20);  
		A b= new A(20,40);
		A c = new A(10,20); 
		A z = new A(20,10); 
		
		A d =a;
		
		System.out.println(a.hashCode() == b.hashCode());// false  false
		System.out.println(a.hashCode() == c.hashCode());// false  true
		System.out.println(a.hashCode() == d.hashCode());// true   true
		
		// note here consider Object class hashCode run
		 // o/p false,false, true;
	}
}
