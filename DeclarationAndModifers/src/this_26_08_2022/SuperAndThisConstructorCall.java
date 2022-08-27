package this_26_08_2022;
class G{
	G(){
		System.out.println("I am Grand Paraent with zero arg");
	}
}
class P extends G{
	P(){
		System.out.println("I am Parent Zero arg construtor");
	}
	P(String msg){
		System.out.println("I am Parent param  construtor");
	}
}

class C extends P{
	
	C(){
		this("abc");
		System.out.println("I am Child class zero arg construtor");
	}
	C(String str){
		super();
		System.out.println("I am Child class param construtor");
	}
	
	
}


public class SuperAndThisConstructorCall {

	public static void main(String[] args) {
		new C();
	}
}
