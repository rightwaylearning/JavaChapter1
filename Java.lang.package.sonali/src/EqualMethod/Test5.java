package EqualMethod;
//If hashcodes of 2 objects are equal then these objects are always equal by == operator 
//also
public class Test5 {
	int i;

	public Test5(int i) {
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
		Test5 t = new Test5(50);
		Test5 t1= new Test5(50);
		System.out.println(t.hashCode());
		System.out.println(t1.hashCode());
		System.out.println(t==t1);
		
	}

}
