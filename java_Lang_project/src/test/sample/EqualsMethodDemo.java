package test.sample;

class Test{
	int a;
	int b;
	Test(int a, int b){
		this.a = a;
		this.b =b;
	}
	
	 @Override
	public boolean equals(Object obj) {
		if(obj instanceof Test) {
			Test t = (Test)obj;
			if(this.a == t.a && this.b == t.b) {
				return true;
			}
		}
		
		return false;
	}
	 
	 @Override
	public int hashCode() {
		return this.a + this.b;
	}
}
public class EqualsMethodDemo {
	

	public static void main(String[] args) {
		
		Test t = new Test(10,20);
		Test t1 = new Test(30,40);
		Test t2 = new Test(20,10);
		Test t3 = t;
		
		System.out.println(t.equals(t1)); // false
		System.out.println(t.equals(t2)); // true
		System.out.println(t3.equals(t)); // true
		
		System.out.println(t.hashCode() == t1.hashCode());
		System.out.println(t.hashCode() == t2.hashCode());
		System.out.println(t3.hashCode() == t.hashCode());
	}
}


// contract between equals & hashCode()
// 1] if equals method return true  >> hashCode must be same
// 2] if equals methods return false >>  hashCode may or may not  be same

// 3] 2 objects hashCode are same >>  true