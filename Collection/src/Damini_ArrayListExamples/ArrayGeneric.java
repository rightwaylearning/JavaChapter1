package Damini_ArrayListExamples;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayGeneric {
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Damini");
		al.add("Devsya");
		al.add("Durva");
		
		for (String s:al)
		{
	       System.out.println(s);
	       System.out.println(s.length());
		}
	}

}
