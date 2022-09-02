package Damini_Hashset;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicateFromAl {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);	al.add(20);	al.add(30);	al.add(40);	al.add(20);	
		al.add(50);	al.add(30);	al.add(40);	al.add(60);
		
		System.out.println(al);
		LinkedHashSet<Integer> ls=new LinkedHashSet<Integer>(al);
		System.out.println(ls);
	}
	
}
