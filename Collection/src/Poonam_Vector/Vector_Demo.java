package Poonam_Vector;

import java.util.Vector;

public class Vector_Demo {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		v.add(10);
		v.add(20);
		v.add("PoonaM");
		
		System.out.println(v);
		
		v.add(1,200);
		v.addElement(30);
		
		System.out.println(v);
		
		boolean b = v.remove("PoonaM");
		v.remove(0);
		
		System.out.println(v);
		v.removeElement(b);
		
		System.out.println(b);
		
		
	}
	
}
