package Damini_ArrayListExamples;

import java.util.ArrayList;

public class DemoArrayList {
	public static void main(String[] args) {
		
		ArrayList al =new ArrayList();
		al.add(20);
		al.add(40);
		al.add(60);
		
		ArrayList smallList=new ArrayList();
		smallList.add("Damini");
		smallList.add("Durva");
		
		al.addAll(smallList);
		al.add(40);
		System.out.println(al);
		
		al.remove(Integer.valueOf(20));
		System.out.println(al);
		
		ArrayList a=new ArrayList();
		a.add(69);
		a.add(10);
		//System.out.println(a);
		al.addAll(a);
	al.removeAll(a);
		System.out.println(al);
		
		al.removeAll(smallList);
		System.out.println(al);
	}

}
