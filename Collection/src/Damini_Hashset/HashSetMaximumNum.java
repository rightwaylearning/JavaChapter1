package Damini_Hashset;

import java.util.HashSet;

public class HashSetMaximumNum {

	public static void main(String[] args) {
	
					
				//or
	HashSet<Integer> lhs=new HashSet<Integer>();
		lhs.add(20);
		lhs.add(30);
		lhs.add(40);
		lhs.add(10);
		lhs.add(20);
		lhs.add(30);
		lhs.add(10);
		
		System.out.println(lhs);
		
		
		for(Integer item :lhs)
		{
			boolean flag=lhs.contains(item);
		}
	}
}