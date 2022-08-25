package Damini_25_8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Z
{
	List<Integer> generateList(List<Integer> list){
		
		list.add(100);
		//list.add("ss"); store only int value because generic 
		list.add(200);
		list.add(300);
		
		return list;
	}
	}

public class Color {

	public static void main(String[] args) {
		
		Z list=new Z();
		List<Integer> al=list.generateList(new ArrayList<Integer>());
		System.out.println(al.getClass().getName());
		
		List<Integer> ll=list.generateList(new LinkedList<Integer>());
		System.out.println(ll.getClass().getName());
	}
}
