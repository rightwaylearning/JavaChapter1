package Kalpesh;

import java.util.ArrayList;
import java.util.Iterator;

public class logic {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		System.out.println(al);
		
		Iterator<Integer> itr =al.iterator();
		
	while (itr.hasNext()) {
	Integer i = itr.next();
		System.out.println(itr.next());
		if (i  % 2==0) {
			itr.remove();
			
	}
	
	
	}
		
	System.out.println(al);	
		
	}

}
