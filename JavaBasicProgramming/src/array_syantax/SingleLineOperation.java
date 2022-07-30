package array_syantax;

public class SingleLineOperation {

	public static void main(String[] args) {
		
		int[] a; // declartion
		
		// construction  or memory allocation or object creation
		a = new int[4]; 
		
		// data init to array element
		a[0] = 10;
		a[1] = 20;
		a[2] = 20;
		a[3] = 20;
		
		// -----------------------
		// array declaration + memory allocation + data init
		int[] aa = {10,20,30,40}; 
		System.out.println(aa.length);
		System.out.println(aa[0]);
		
		
		// upcasting
		
		double[] value= {10, 10.6F,'A', 89L};  // up casting
		
		int[] aw = {67,56,'A'};
		
		// array exchange;
		
		char[] chararr = {'A','b','c'};
		
		int[] arra1 = {10,20,30};
		
	//	arra1 = chararr;  // up cas not posiible
		
		// with array size & array element u can do up cast or down cast
		// but with array type you can't
		
		
	}
}
