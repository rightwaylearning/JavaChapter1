package Damini_25_8;

import java.util.Vector;

public class VectorInterface {

	public static void main(String[] args) {
		Vector v=new Vector();
		
		v.add(100);
		v.add("Damini");
		v.add(null);
	
		v.addElement(20);
		v.add(0, 20);
		
		
		boolean b=v.removeElement(20);
		System.out.println(v);
		
		
	}
}
