package TestSample_Jivan;

class A{
	int a;
	int b;
	A(int a, int b){
		this.a = a;
		this.b = b;
	}
	@Override
	public int hashCode() {
		return this.a + this.b;
		
	}
}

public class HashCodeMethodDemo {

	public static void main(String[] args) {
		A a = new A(10, 20);
		A a1 = new A(20, 10);
		A a2 = new A(10, 20);
		A a3 = a;
		System.out.println(a.hashCode());
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a3.hashCode());
		System.out.println(a == a2);
		System.out.println(a.hashCode() == a2.hashCode());
		System.out.println(a.hashCode() == a1.hashCode());
	}
}

// compare == (double equal) operator and hashCode method
// e1 & e2 two reference variables
// case 1
// 1] e1 == e2  >> true.  e1.hashCode() & e2.hashCode() >>  same hashCode

// case 2
// 2] e1 == e2  >> false.  e1.hashCode() & e2.hashCode() >> may or may not same true or false

// case 3
// 3] e1.hashCode() == e2.hashCode()  >> true >>>>>> e1 == e2  >>  may or may not be true

// case 4
// 4]  e1.hashCode() == e2.hashCode()  > false e1 == e2 >> false


// Rules
//  item == item
// 1] primitive items >> value check if value is same then true otherwise false
// 2] reference variable >> if both pointing to same object then only true

// 1] toString() >> 
// 1] hashCode() >> always write a logic on basis of properties
// e1 == e2 difference e1.hashCode() == e2.hashCode();
// 3] boolean equals(object o){e1.equals(e2){}}
// 4] boolean equals(object o){return this == o; };





