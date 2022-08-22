package Akshay_ArrayList;

import java.util.ArrayList;

public class ALExample {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList ();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		System.out.println(al);
		System.out.println("==========================");
		
		al.add(1);
		al.add(15);
		System.out.println(al);
		System.out.println("==========================");
		
		ArrayList colour = new ArrayList ();
		colour.add("Yellow");
		colour.add("Pink");
		
		al.addAll(colour);
		System.out.println(al);
		System.out.println("==========================");
		
		ArrayList days = new ArrayList ();
		days.add("Monday");
		days.add("Friday");
		
		al.addAll(0, days);
		System.out.println(al);
		System.out.println("==========================");
		System.out.println("Contains ('white') =  "+al.contains("white"));
		System.out.println("Contains ('Yellow') =  "+al.contains("Yellow"));
		System.out.println("==========================");
		System.out.println("(al.containsAll(days) = "+al.containsAll(days));
		System.out.println("==========================");
		System.out.println("al.size() =  "+al.size());
		System.out.println("==========================");
		System.out.println("al.isEmpty() =  "+al.isEmpty());
		System.out.println("==========================");
		
//		al.clear();
//		System.out.println(al);
		
		System.out.println("al.get(4) =  "+al.get(4));
		System.out.println("==========================");
		
		al.remove("Yellow");
		al.remove(0);
		System.out.println(al);
		System.out.println("==========================");
		
		al.removeAll(days);
		al.removeAll(colour);
		System.out.println(al);
		
		
	}

}
