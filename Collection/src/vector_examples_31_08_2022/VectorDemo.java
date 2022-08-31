package vector_examples_31_08_2022;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>(); // 10
		System.out.println(v.capacity());
		 for(int i =0 ;i<=10;i++) {
			  v.add(i);
		 }
		
		 System.out.println(v.capacity());
		 // ---------------------------
		 
		 Vector<Integer> v1 = new Vector<>(30,5);
		 System.out.println(v1.capacity()); // 30
		 for(int i =1 ;i<=36;i++) {   // 40
			  v1.add(i);
		 }
		 System.out.println(v1.capacity()); //  40
	}
}
