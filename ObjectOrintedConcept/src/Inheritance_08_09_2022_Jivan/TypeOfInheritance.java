package Inheritance_08_09_2022_Jivan;

class A{}
class B{}

class C extends A{
	
}

public class TypeOfInheritance {
	
	public static void main(String[] args) {
		
	}

}

abstract class AA{
	void m1() {}
	abstract void m2();
}

abstract class BB extends AA{
	abstract void m3();
}

class CC extends BB{
	void m2() {}
	void m3() {}
}

abstract class DD{
	void m1()  {System.out.println("______________________");}
	abstract void m2();
}

abstract class MM extends DD{
	void m2() {System.out.println("______________________");}
	abstract void m1();
}

class GG extends MM{
	void m1() {}
}



