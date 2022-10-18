package top.ten.exception;

class P{}
class C extends P{}

public class ClassCastException {

	public static void main(String[] args) {
		
		P p= new C();
		
		C c1= (C)new P();
		System.out.println("done..");
	}
}
