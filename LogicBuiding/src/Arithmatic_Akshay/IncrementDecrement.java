package Arithmatic_Akshay;

public class IncrementDecrement {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = a++; // Here a++ is called post Increment
		
		System.out.println(a); // Answer is = 11
		System.out.println(b); // Answer is = 10
		
		System.out.println("-------------------------");
		
		System.out.println(b); // Answer is = 10
		System.out.println(a); // Answer is = 11
		
		System.out.println("===========================================================");
		
		int c = 15;
		int d = ++c; // Here ++c is called pre Increment
		
		System.out.println(c); // 16
		System.out.println(d); // 16
		
		System.out.println("-------------------------");
		
		System.out.println(d); // Answer is = 16
		System.out.println(c); // Answer is = 16
		
		System.out.println("===========================================================");
		
		int e = 20;
		int f = e--; // Here e-- is a Post Decrement
		
		System.out.println(e); // Answer is = 19
		System.out.println(f); // Answer is = 20
		
		System.out.println("-------------------------");
		
		System.out.println(f); // Answer is = 20
		System.out.println(e); // Answer is = 19
		
		System.out.println("===========================================================");
		
		int g = 25;
		int h = --g; // Here --g is a Pre Decrement
		
		System.out.println(g); // Answer is = 24
		System.out.println(h); // Answer is = 24
		
		System.out.println("-------------------------");
		
		System.out.println(h); // Answer is = 24
		System.out.println(g); // Answer is = 24
		
		System.out.println("===========================================================");
		
		int i = 30;
		int j = i+1;
		
		System.out.println(i); // Here Answer is = 30
		System.out.println(j); // Here Answer is = 31
		
		System.out.println("-------------------------");
		
		int k = 35;
		int l = k-1;
		
		System.out.println(k); // Here answer is = 35
		System.out.println(l); // Here Answer is = 34
				
		System.out.println("===========================================================");
		
//		byte m = 32;
//		byte n = k+1; // Here Compile time error "Type mismatch: cannot convert from int to byte". (Due to Casting type)
		
		byte m = 32;
		int n = m+1;
		
		System.out.println(m);
		System.out.println(n);
	}

}
