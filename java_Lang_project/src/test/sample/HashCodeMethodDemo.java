package test.sample;

class B{
	int a;
	int b;
	B(int a, int b){
        this.a =a;
        this.b =b;
	}
	@Override
	public int hashCode() {
		return this.a + this.b;
	}
}
public class HashCodeMethodDemo {

	public static void main(String[] args) {
		B B = new B(10,20);
		
		B B2 = new B(10,20);
		
		B B5 = new B(100,200);
		B B3 = B;
		
		
	//	System.out.println(B.hashCode());
		
	//	System.out.println(B2.hashCode());
		 System.out.println(B.hashCode() == B2.hashCode());
		 System.out.println(B.hashCode() == B5.hashCode());
	}
}
// compare == operator & hashCode methdo
// e1 & e2 two referece variable

 //  1]  e1 == e2 >> true   e1.hashCode() & e2.hashCode() >> same hashCode
 //  2]  e1 == e2 >> false  e1.hashCode() & e2.hashCode() >> may or may not same true
 
//   3] e1.hashCode() == e2.hashCode() > true   >>>>  e1 == e2  >> may or may not true
//   4] e1.hashCode() == e2.hashCode() > false   e1==e2 >> false



//   item == item
//  1] primitive items  >> value check if value is same then true otherwise false
//  2] refe varibale   >> if both ref pointing to same object then only true
		   
  		   
		//   Object o;
		   

// 1] toString() >> 
// 2] hashCode() >> always write logic on basis of properties
//      e1==e2   diff e1.hashCode() == e2.hashCode();
// 3]    boolean equals(Object o){ e1.equals(e2){} }

//  4]   boolean equals(Object o){ return this == o;}




















