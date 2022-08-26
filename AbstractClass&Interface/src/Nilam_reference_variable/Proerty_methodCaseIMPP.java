package Nilam_reference_variable;

class superclass {
	int m = 20;

	void m1() {
		System.out.println(" i am super class");
	}

}

class subclass extends superclass {
	int m = 30;

	void m1() {
		System.out.println("subclass");
	}

	void showdata() {
		System.out.println(this.m);
		System.out.println(super.m);

		super.m1();
		this.m1();
	}
}

public class Proerty_methodCaseIMPP {
	public static void main(String[] args) {
		// case 3
		superclass s = new subclass();
		System.out.println(s.m);// 20
		s.m1();// subclass
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");
		// case1
		superclass s1 = new superclass();
		System.out.println(s.m);
		s.m1();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");
		// case 2
		subclass s2 = new subclass();
		s2.showdata();
		// case 3
		// subclass s3=new superclass(); invalid

	}

}
