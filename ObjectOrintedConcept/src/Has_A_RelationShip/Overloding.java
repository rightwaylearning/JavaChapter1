package Has_A_RelationShip;

public class Overloding {

	public void methodone() {
		System.out.println("no-arg method");
	}

	public void methodone(int i) {
		System.out.println("int - arg method");
	}

	public void methodone(String s) {
		System.out.println("String-arg method");
	}

	public void methodone(Object o) {
		System.out.println("object-arg method");
	}

	public void methodone(int i, float f) {
		System.out.println("int-float arg");
	}

	public void methodone(float f, int i) {
		System.out.println("float-int args");
	}

	public static void main(String[] args) {
		Overloding l = new Overloding();
		l.methodone();
		l.methodone(2);
		l.methodone(10);
		l.methodone("sonali");
		l.methodone(1, 2f);
		l.methodone(2f, 1);

	}
}
