package main_this_referanceVariable;

public class ExampleDemo {

	public static void main(String[] args) {
		
		Test t = new Test();
		t.a = 10;
		t.b = 20;
		
		// t.showUp();
		
		t.showUpAgain();
		
		// -------------------
		
		Test t1 = new Test();
		t1.initData(1, 2);
		System.out.println(t1.a);
		System.out.println(t1.b);
		
		
		
		//------
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");
		Test t2 = new Test();
		t2.init(99, 999);
		System.out.println(t2.a);
		System.out.println(t2.b);
	}
}
