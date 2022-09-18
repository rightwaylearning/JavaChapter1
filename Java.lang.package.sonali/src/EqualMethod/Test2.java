package EqualMethod;
//If hash Codes of 2 objects are not equal then .equals() method always return false
class A {
	int i;

	public A(int i) {
		super();
		this.i = i;
	}

	@Override
	public int hashCode() {

		return i;
	}

	@Override
	public String toString() {
		return "" + i;
	}

}

public class Test2 {
	public static void main(String[] args) {

		A a = new A(10);
		A a1 = new A(20);

		System.out.println(a.hashCode());
		System.out.println(a1.hashCode());
		System.out.println(a.hashCode() == a1.hashCode());
		System.out.println(a.equals(a1));
	}
}
