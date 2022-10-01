package ArrayListSamples_Jivan;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListGeneric {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("abc");
		al.add("lmn");
		al.add("red");
		
		for(String s : al) {
			System.out.println(s);
			System.out.println(s.length());
			
		}
//		List al1 = new ArrayList();
//		Collection c = new ArrayList();
//		Object o = new ArrayList();
	}

}
