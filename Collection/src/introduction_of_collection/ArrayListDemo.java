package introduction_of_collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();  
// capacity is 10 if u create object of AL using zero arg constructor
//  new capacity = (current Capacity * 3/2 + 1)		
		
		al.add(10);
		al.add(20);
		al.add(200);
		al.add(10);
		al.add(30);
		al.add("sachin");
		al.add("50");
		al.add(30);
		System.out.println(al);
		// [10, 20, 200, 10, 30, sachin, 50, 30]
		
		//System.out.println(al.get(30));
		
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		al.remove(0);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		al.clear();
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
	}
}
