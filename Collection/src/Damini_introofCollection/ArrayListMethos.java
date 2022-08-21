package Damini_introofCollection;

import java.util.ArrayList;

public class ArrayListMethos {

	public static void main(String[] args) {
		
		ArrayList a=new ArrayList();
		
		// capacity is 10 if u create object of AL using zero arg constructor
	//  new capacity = (current Capacity * 3/2 + 1)		
			
		a.add(10);
		a.add(20);
		a.add(300);
		a.add(10);
		a.add("Damini");
		a.add(20);
		System.out.println(a);
		
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		a.remove(0);
		a.clear();
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		
		
	}
}
