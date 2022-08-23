package Damini_ArrayListExamples;

import java.util.ArrayList;

public class Alview {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(40);
		
		ArrayList color =new ArrayList();
		    color.add("Red");
		    color.add("Black");
		    
		 al.addAll(color);
		
		System.out.println(al);
		System.out.println(al.get(3));
		
		System.out.println(">>>>>>>>>>>>>>>>");
		
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println("================");
		
		int i=0;
		while(i<al.size())
		{
			System.out.println(al.get(i));
			i++;
			
		}
		System.out.println("----------------------");
		
		for(Object o:al) {
			
			System.out.println(o);
		}
	}
}
