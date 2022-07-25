package main_this_referanceVariable;

public class Test {

	int a;
	int b;
	
	void showUp() {
		System.out.println(a);
		System.out.println(b);
	}
	
	void showUpAgain() {
		int a = 100;
		int b =200;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(this.a);
		System.out.println(this.b);
	}
	
	void initData(int x,int y) {
		 a = x;
		 b = y;
	}
	
	void init(int a, int b) {
		this.a =a;
		this.b =b;
	}
	
	
}
