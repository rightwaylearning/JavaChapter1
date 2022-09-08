package Test_Jivan;

class Parent{
	
	int x;
	int y;
	Parent() {
		super();
		System.out.println("Hello I am Parent class");
	}
}

class Child extends Parent {
	
	int m;
	int n;
	Child() {
		super();
		System.out.println("Hello I am Child class");
	}
}

public class Controller {
	public static void main(String[]args) {
		
		Child c = new Child();
		System.out.println(c.m);
		System.out.println(c.n);
		System.out.println(c.x);
		System.out.println(c.y);
	}
}

