package IntroOfCollection_Jivan;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(200);
		al.add(30);
		al.add("Sachin");
		al.add(50);
		al.add("50");
		al.add(10);
		al.add(30);
		
		System.out.println(al);
		
		// [10, 20, 200, 40, 30, Sachin, 50, 50, 10, 30]
		
//		System.out.println(al.get(3));
		System.out.println(al);
		System.out.println(al.isEmpty());
		al.remove(0);
		System.out.println(al);
		al.clear();
		System.out.println(al);
		System.out.println(al.size());
	}
}
