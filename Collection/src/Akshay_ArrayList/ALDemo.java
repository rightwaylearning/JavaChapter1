package Akshay_ArrayList;

import java.util.ArrayList;

public class ALDemo {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList ();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(80);
		al.add(90);
		al.add(100);
		al.add(200);
		al.add(220);
		
		System.out.println(al);
		
		ArrayList small = new ArrayList ();
		small.add("PQ");
		small.add("ZY");
		
		al.addAll(small);
		al.add(40);
		
		System.out.println(al);
		
		al.remove(Integer.valueOf(40)); // This is for remove only single content.
		System.out.println(al);
		
		ArrayList ab = new ArrayList ();
		ab.add(30);
		ab.add(60);
		ab.add(40);
		
		al.removeAll(ab);
		System.out.println(al);
		
		al.removeAll(small);
		System.out.println(al);
	}

}
