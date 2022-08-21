package nikhil_arraylistexample;


import java.util.ArrayList;


public class arraylistdemo {
	
	public static void main(String[] args) {
	
		ArrayList al = new ArrayList();
		
		al.add(30);
		al.add(20);
		al.add(10);
		
		ArrayList al2 = new ArrayList();
		
		al2.add("ab");
		al2.add("cd");
		
		al.addAll(al2);
		System.out.println(al);
		
		
		al.remove(Integer.valueOf(30));
		
		System.out.println(al);
		
		
		ArrayList al3 = new ArrayList();
		
		al3.add(40);
		al3.add(50);
		
		al.addAll(al3);
		
		
		System.out.println(al);
	
		al.removeAll(al2);
		
		System.out.println(al);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
