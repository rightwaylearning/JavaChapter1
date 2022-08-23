package test;

class Parent {
	int x;
	int y;
	Parent(){
		System.out.println("hello I am Parent class");
	}
}

class Child extends Parent {
	int m;
	int n;
	Child(){
		System.out.println("Hello I am Child class");
	}
}

public class Controller {
	public static void main(String[] args) {

		Child c= new Child();
	
	}
}
