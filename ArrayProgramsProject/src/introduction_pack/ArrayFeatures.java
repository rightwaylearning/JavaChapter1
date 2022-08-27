package introduction_pack;

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
		//--------------------------
		
		Object[] arr = new Object[10];
		
        arr[0] = new P();
        arr[1] = new D();
        arr[2] = new C();
        
        // Collection
        
        // Adv
        // 1] if u know index then u can access any element in space speed
        
        // dis
        // size fixed
        // hetro
        // 
	}
}
