package Sonali_collection_All_Example;

import java.util.Comparator;
import java.util.TreeSet;

public class StringBufferIntoTreeSet {

	//Write a program to insert StringBuffer objects into the TreeSet where the sorting 
	//order is alphabetical order
	
	public static void main(String[] args) {
		TreeSet t = new TreeSet<>();
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("S"));
		t.add(new StringBuffer("L"));
		t.add(new StringBuffer("U"));
		System.out.println(t);
	}
}
class Reverse implements Comparator< StringBufferIntoTreeSet>{
	@Override
	public int compare(StringBufferIntoTreeSet o1, StringBufferIntoTreeSet o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return -s1.compareTo(s2);
	}
}