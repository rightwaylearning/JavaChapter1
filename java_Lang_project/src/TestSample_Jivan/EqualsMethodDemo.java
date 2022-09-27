package TestSample_Jivan;

class Test{
	int a;
	int b;
	Test(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Test) {
			Test t = (Test)obj;
			if(this.a == t.a && this.b == t.b) {
				return true;
				}
		}
		@Override
		
	}
}

public class EqualsMethodDemo {

	public static void main(String[] args) {
		
		Test t = new Test(10, 20);
		Test t1 = new Test(30, 40);
		Test t2 = new Test(10, 20);
		Test t3 = t;
		
		System.out.println(t.equals(t1));
		System.out.println(t.equals(t2));
		System.out.println(t.equals(t));
		
		System.out.println(t.hashCode() == t1.hashCode());
		System.out.println(t.hashCode() == t2.hashCode());
		System.out.println(t3.hashCode() == t.hashCode());
	}
}

// contract between equals and hashCode()
// 1] if equals method return true >> hashCode must be same
// 2] if equals method return false >> hashCode may or may not be same
// 3] 2 objects hashCode are same >> then equals method return may or may not true
// 4] 2 objects hashCode are not same >> 100% method return false
