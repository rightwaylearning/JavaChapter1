package array_syantax;

public class ArrayTypeAssignment {

	public static void main(String[] args) {
		int[] a = {10,20,30};
		
		int[] b = {100,200,300};
		
		// here no up cast or down cat becuase a, b both having same type
		a =b ; 
		// after re assignment both reference variable pointing to same object   
		
		System.out.println(a[0]); // 100
		System.out.println(b[0]); //0
		
	}
}
