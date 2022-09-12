package IntroductionPack_Jivan;

class P{
	
}

class C extends P{
	
}

class D{}

public class ArrayFeatures {

	public static void main(String[] args) {
		
		P[] p = new P[5];
		
		p[0] = new P();
		
		p[1] = new C();
		
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		
		Object[] arr = new Object[10];
		
		arr[0] = new P();
		arr[1] = new D();
		arr[2] = new C();
		
		// Collection
		
		// Advantage of array
		// 1] If you know index then you can access any element in space speed
		
		// Limitations of array
		// 1] size is fixed
		// 2] heterogeneous not allowed only homogeneous
	}
}






