package nikhil_introductionofcolectionexample;

import java.util.ArrayList;

public class arraylistpractise {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add("Below numbers are even numbers");
		al.add(24);
		al.add(26);
		al.add(28);
		al.add(30);
		al.add(32);
		al.add(34);
		al.add(36);
		al.add(38);
		al.add(40);
		al.add("Below numbers are odd numbers");
		al.add(25);
		al.add(27);
		al.add(29);
		al.add(31);
		al.add(33);
		al.add(35);
		al.add(37);
		al.add(39);
		
		System.out.println(al);
		System.out.println(al.get(3));
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		
		al.clear();
		
		System.out.println(al);
		
	    System.out.println(al.size());
	    
	    System.out.println();
	    
	    System.out.println(al.isEmpty());
	
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
