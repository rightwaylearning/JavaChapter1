package EqualMethod;

public class Test4 {

	int i;

	public Test4(int i) {
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
		Test4 t = new Test4(30);
		Test4 t1 = new Test4(30);
		System.out.println(t.hashCode());
		System.out.println(t1.hashCode());
		System.out.println(t == t1);
		System.out.println(t.equals(t1));
	}
}
