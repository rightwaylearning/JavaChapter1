package Akshay_ArrayList;

import java.util.ArrayList;

public class ArrayListGeneric {
	
	public static void main(String[] args) {
		
		ArrayList <String> al = new ArrayList <String> ();
		al.add("abc");
		al.add("lmno");
		al.add("pqrst");
		
		for (String s : al) {
			
			System.out.print(" "+s);
			System.out.print(" Length is = "+s.length()+"\n");
		}
		
	}

}
