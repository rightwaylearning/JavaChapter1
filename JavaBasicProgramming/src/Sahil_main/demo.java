package Sahil_main;

public class demo {
	
    public static void main(String[] args) {
		
		test t = new test();
		t.a = 18;
		t.b = 28;
		
		t.showUpAgain();
		
		test t1 = new test();
		t1.initData(25, 50);
		System.out.println(t1.a);
		System.out.println(t1.b);
	
		test t2 = new test();
		t2.init(22, 333);
		System.out.println(t2.a);
		System.out.println(t2.b);
	}
}

