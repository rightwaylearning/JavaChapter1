package EqualityOperators;

public class Examples {

	public static void main(String[] args) {
		
		short a = 10;
		double d = 10.00;
		
		boolean r =  a == d;
		System.out.println(r);
		
		
		boolean b = false;
		boolean b1 = false;
		
		boolean r1 = b == b1;
		System.out.println(r1);
		
		Student s1 =new Student();
		Student s2 =new Student();
		Student s3 = s1;
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s3);
		
		String s = new String("abc");
		String s4 = new String("abc");
		System.out.println(s==s4);
		
		Object o = new Object();
		A a11= new A();
		B b11= new B();
		C c11= new C();
		D d11= new D();
		
		System.out.println(a11==b11);
		System.out.println(o == d11);
//System.out.println(c11 == d11);
		
	}
}

class A{}
class B extends A{}
class C extends B{}
class D extends A{}





class Student{}