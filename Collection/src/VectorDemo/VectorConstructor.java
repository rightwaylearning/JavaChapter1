package VectorDemo;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorConstructor {

	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<>();
		// Collection , List
		  // 1] insertion oredr
		  ///2] duplicate object
		  // 3] null
		  // 4] HETRO obj i allow
		  // >>> most of the operation are retrival (read on basis of index)
		   // >> thread safe
		
		 for(int i = 10 ; i <=100 ; i = i + 10) {
			 v.add(i);
		 }
		
		 
		 System.out.println(v);
		 System.out.println(v.size()); // 10
		 System.out.println(v.capacity()); // 10
		 System.out.println(">>>>>>>>>>>>");
		 v.add(110);
		 System.out.println(v);
		 System.out.println(v.size()); // 11
		 System.out.println(v.capacity()); // 20
		 System.out.println(">>>>>>>>>>>>");
		 Vector v1= new Vector(100);
		  System.out.println(v1);
		  System.out.println(v1.size());    //  0
		  System.out.println(v1.capacity()); // 100
		  
		  for(int i = 0 ; i<=101;i++) {
			  v1.add(i);
		  }
		  System.out.println(v1); // [ 0,1, .... 101]
		  System.out.println(v1.size());    //  102
		  System.out.println(v1.capacity()); // 200
		  
		  
		 ListIterator i = null;
		
		  
		  

	}
}
