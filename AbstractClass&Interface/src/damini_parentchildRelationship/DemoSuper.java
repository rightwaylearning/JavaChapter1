package damini_parentchildRelationship;



	class A {

		A() {
			super();
			System.out.println("A");
		}
	}

	class B extends A {
		B() {
			super();
			System.out.println("B");
		}
	}

	class C extends A {
		C() {
			super();
			System.out.println("C");
		}
	}
	public class DemoSuper{
		DemoSuper()
		{
			super();
			System.out.println("EntryPoint");
		}
	public static void main(String[] args) {
			C c=new C();
			
		}
	}


