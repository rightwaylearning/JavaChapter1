package TestSample_Jivan;

import java.lang.reflect.Constructor;

class D{
	D(){
		
	}
	D(int a, int b){}
	
	void m1() {}
	void m2() {}
}

public class ClassclassDemo {

	public static void main(String[] args) {
		
		D a = new D();
		Class obj = a.getClass();
		
		System.out.println(obj.getName());
		
		Constructor[] cs = obj.getDeclaredConstructors();
		for (int i = 0; i < cs.length; i++) {
			System.out.println(cs[i]);
		}
	}
}
