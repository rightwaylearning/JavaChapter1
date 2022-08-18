package Damini_introofCollection;

import java.util.ArrayList;

public class ArrayCollection {
	public static void main(String[] args) {
		Student[] ar=new Student[5];
		int[] i=new int[5];
		
		ar[0]=new Student();
		ar[1]=new Student();
		ar[2]=new Student();
		//ar[3]=new College(); C.E Type mismatch
		
		
		ArrayList a=new ArrayList();
		
		a.add(new Student());
		a.add(new College());
		a.add(new Test());
		
		System.out.println(a.add(10));
	}
	

}
