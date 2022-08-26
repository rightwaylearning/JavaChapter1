package NilamCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class LogicalProgram {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(12);
		al.add(13);
		al.add(20);
		al.add(23);
		al.add(55);
		al.add(60);

		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			Integer i = itr.next();
			if (i % 2 == 0) {
				itr.remove();
			}
			}
			System.out.println(al);

		
	}
}