package Jivan_this_26_08_2022;

class A{
	int a, b, c, d;
	
	A() {
		this(1,1,1,1);
		System.out.println("I am zero arg constructor");
		//this.a = 1;
		//this.b = 1;
		//this.c = 1;
		//this.d = 1;
	}
	
	A(int a, int b, int c, int d){
		System.out.println("I am param constructor");
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		
	}
}

public class thisConstructorCall {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.a);
		System.out.println(a.b);
		System.out.println(a.c);
		System.out.println(a.d);
	}
}
