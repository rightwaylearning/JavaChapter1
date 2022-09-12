package Jivan_this_26_08_2022;

class G{
	G(){
		System.out.println("I am grand Parent with zero arg");
	}
}

class P extends G{
	P(){
		System.out.println("I am parent zero arg constructor");
	}
	P(String msg){
		System.out.println("I am parent param constructor");
	}
}                                                                                                                                                                                   

class C extends P{
	
	C(){
		this("abc");
		System.out.println("I am child class zero arg constructor");
	}
	C(String str){
		System.out.println("I am child class param constructor");
	}
}


public class SuperAndThisConstructorCall {
	
	public static void main(String[] args) {
		new C();
	}

}
