package MethodOverriding;

class A{}
class B extends A{}
class T{} 

class P{
	 Number m1(Number n) {
		System.out.println("Parent");
		return null;
	}
}
// 1] public 2] protected 3] default 4] private  >>>> flow of modifiers
class C extends P{

	 public 	Double m1(Number n) {
		System.out.println("Child");
		return null;
	}
}
public class Controller {
	public static void main(String[] args) {
		P p = new C(); p.m1(10);
		
	}
}
