package Sonali_collection_All_Example;

import java.util.Comparator;
import java.util.TreeSet;

public class Test {
	//Write a program to insert String objects into the TreeSet where the sorting order 
	//is reverse of alphabetical order. 
	
	public static void main(String[] args) {
		TreeSet  t = new TreeSet<>();
		t.add("sonali");
		t.add("Rups");
		t.add("Bestii");
		t.add("Priti");
		t.add("Pinkii");
		
		System.out.println(t);
		
	}

}
/*class Reversed implements Comparator<Test>{
	@Override
	public int compare(Test o1, Test o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		
		return s1.compareTo(s2);
	}
}*/
				
	