package Akshay_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class LogicalPrograms {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer> ();
		al.add(30);
		al.add(31);
		al.add(32);
		al.add(33);
		al.add(34);
		al.add(35);
		
		Iterator<Integer> itr = al.iterator();
		
		while (itr.hasNext()) {
			
			Integer i = itr.next();
			
			if ( i % 2 == 0) {
				itr.remove();
			}
		}
		
		System.out.println(al); // Answer is 31,33,35
		
	}

}
