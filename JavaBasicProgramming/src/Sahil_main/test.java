package Sahil_main;

public class test {
	int a;
	int b;
	public int y;
	public int x;
	
	void showUp() {
		System.out.println(a);
		System.out.println(b);
	}
	
	void showUpAgain() {
		int a = 300;
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
	  
	  
	


	


