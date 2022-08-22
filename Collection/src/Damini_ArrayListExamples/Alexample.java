package Damini_ArrayListExamples;

import java.util.ArrayList;

public class Alexample {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(30);
		al.add(40);
		al.add(20);
		System.out.println(al);
		System.out.println("-------------------------");
		
		al.add(2, 13);
		System.out.println(al);
		System.out.println("------------------------");
		
		ArrayList color=new ArrayList();
		
		color.add("blue");
		color.add("Pink");
		color.add("yellow");
		
		al.addAll(color);
		System.out.println(al);
		System.out.println("-------------------");
		
		ArrayList days=new ArrayList();
		days.add("Monday");
		days.add("Tuesday");
		//al.addAll(days);
		al.addAll(3, days);
		System.out.println(al);
		System.out.println("---------------------------");
		
		System.out.println("contains('green')=" +al.contains("Green"));
		System.out.println("containsAll(days) =" +al.containsAll(days));
		System.out.println("size()= "+al.size());
		//al.clear();
		System.out.println("Isempty()="+al.isEmpty());
		System.out.println(al);
		System.out.println("al.get(2)="+al.get(2));
		al.remove(3);
		al.remove(days);
		System.out.println(al);
	}
	
}
