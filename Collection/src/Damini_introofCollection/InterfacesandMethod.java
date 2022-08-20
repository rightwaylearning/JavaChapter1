package Damini_introofCollection;

import java.util.ArrayList;
import java.util.HashSet;

public class InterfacesandMethod {

	public static void main(String[] args) {
		
		ArrayList a=new ArrayList();
		
		HashSet h=new HashSet();
		boolean b=h.add(10);
		System.out.println(b);
		boolean b1=h.add(30); //Duplicate value not allow
		System.out.println(b1);
		
		
	}
}
