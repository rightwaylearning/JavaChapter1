package Poonam_Set_Demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateRemove_FromList {
	
	public static void main(String[] args) {
		
		int[] arr = {100,200,300,400,500,200,300};
		
		List<Integer> list =new  ArrayList<>();
		
		list.add(1);		list.add(2);		list.add(2);		list.add(3);
		list.add(4);	list.add(5);		list.add(4);
		
		List<Integer> output = new ArrayList<>();
		
		for (Integer data : list) {
			if(output.contains(data)==false)
			{
				output.add(data);
			}
		}
		System.out.println(output);
		
		Set<Integer> set = new HashSet<>(list);
		
		System.out.println(set);
		
	}

}
