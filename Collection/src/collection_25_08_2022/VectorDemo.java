package collection_25_08_2022;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.add(10); // Collection
		v.add("AB"); // Collection
		v.add(0,200); // List
		v.addElement(20); // Vector
		System.out.println(v);
		
		boolean r = v.remove("AB");  // Collection
		v.remove(0);  //List
		v.removeElement("AB");
		System.out.println(r);
		
		System.out.println(v);
		
	}
}
