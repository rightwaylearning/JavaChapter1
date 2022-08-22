package ArrayListExamples;

import java.util.ArrayList;

public class ArrayListGeneric {

	public static void main(String[] args) {
		
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("abc");
		al.add("lmn");
		al.add("red");
		
		for(String s:al) {
			System.out.println(s);
			System.out.println(s.length());
		}
		
		
	}
}
