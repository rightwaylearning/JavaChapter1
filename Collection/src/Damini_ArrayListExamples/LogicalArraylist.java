package Damini_ArrayListExamples;

import java.util.ArrayList;
import java.util.Iterator;

public class LogicalArraylist {
	public static void main(String[] args) {
		
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(10);
		ar.add(20);
		ar.add(40);
		ar.add(50);
		
		Iterator<Integer> itr= ar.iterator();
		
		while(itr.hasNext())
		{
			Integer i=itr.next();
			if(i%2==0)
			{
				itr.remove();
			}
		}
		System.out.println(ar);
	}

}
