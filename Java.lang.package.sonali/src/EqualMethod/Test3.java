package EqualMethod;

//f 2 objects are equal by == operator then their hash codes must be same.
public class Test3 {

	int i;

	public Test3(int i) {
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

	public static void main(String[] args) {
		Test3 t = new Test3(20);
		Test3 t1 = t;
		System.out.println(t.hashCode());
		System.out.println(t1.hashCode());
		System.out.println(t.hashCode() == t1.hashCode());
		System.out.println(t.equals(t1));
	}

}
