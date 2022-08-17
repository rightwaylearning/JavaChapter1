package constuctor;

public class Test {
	int a;
	int b;
	
	Test(int a, int b){
		this.a = a;
		this.b = b;
	} 
	
	Test(){
		
	}
		
	void m1() {
		System.out.println(this.a);
		System.out.println(a);
	}
	
}
