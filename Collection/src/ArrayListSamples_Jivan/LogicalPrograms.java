package ArrayListSamples_Jivan;

import java.util.ArrayList;
import java.util.Iterator;

public class LogicalPrograms {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(20);
		al.add(21);
		al.add(22);
		al.add(23);
		al.add(24);
		al.add(25);
		
		System.out.println(al);    // [20, 21, 22, 23, 24, 25]
		
		Iterator<Integer> itr = al.iterator();
		
		while(itr.hasNext()) {
			Integer i = itr.next();
			if(i % 2 == 0) {
				itr.remove();    // [21, 23, 25]
//			System.out.println(itr.next()); 
				System.out.println(i);     // 20, 22, 24
		}
	}
		
		System.out.println(al);    //[20, 21, 22, 23, 24, 25]
	}
}