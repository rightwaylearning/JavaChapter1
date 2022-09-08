package Test_Jivan;

class W{
	W() {
		super();              
		System.out.println("W");
	}
}

class X extends W{
	X() {
		super();
		System.out.println("X");
	}
}

class Z extends X{
	Z() {
		super();
		System.out.println("Z");
	}
}

public class EntryPoint {
	
	EntryPoint(){
		super();
	}
	
	public static void main(String[] args) {
		//Z z = new Z();
		X x = new X();
	}
}
