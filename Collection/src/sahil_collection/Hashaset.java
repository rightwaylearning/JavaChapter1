package sahil_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;



public class Hashaset {
	public static void main(String[] args) {
		
	
		HashSet<String> it1 = new HashSet<String>();
		it1.add("sahil");
        it1.add("nike");
		it1.add("divay");
		it1.add(null);
		it1.add("sahil");
		it1.add("nike");
		it1.add(null);
		System.out.println(it1);
		
		Iterator<String> itr = it1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	LinkedHashSet<String> par = new LinkedHashSet<String>() ;
	par.add("sahil");
	par.add("nike");
	par.add("divay");
	par.add(null);
	par.add("sahil");
	par.add("nike");
	par.add(null);
	System.out.println(par);
	
	Iterator<String> itr1 = par.iterator();
	while (itr1.hasNext()) {
		System.out.println(itr1.next());
	}
}
}