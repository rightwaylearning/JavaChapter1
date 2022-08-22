package ArrayListExamples;

import java.util.ArrayList;

public class ALExample {

	public static void main(String[] args) {
		
		
		// boolean add(Object) -  C
		// boolean addAll(list) - C
		// boolean add(index,object) -- L
		// boolean addAll(index, list) -- L
		// int size() --- C
		// boolean isEmpty() -- C
		// boolean contain(object);
		// boolean conatinAll(list);
		// clear();
		
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);
		System.out.println(">>>>>>>");
		
		al.add(1,15);
		System.out.println(al);
		System.out.println(">>>>>>>");
					ArrayList color = new ArrayList();
					color.add("red");
					color.add("blue");
		al.addAll(color);	
		System.out.println(al);
		System.out.println(">>>>>>>>>>");
		            ArrayList days = new ArrayList();
		            days.add("Sunday"); days.add("saturday");
	  	al.addAll(3, days)	;
	  	System.out.println(al);
		System.out.println(">>>>>>>>>>");
		System.out.println("contains('white') = "+al.contains("white"));
		System.out.println("al.containsAll(days) "+al.containsAll(days));
		System.out.println("al.size() =" + al.size());
		System.out.println("al.isEmpty() ="+al.isEmpty());
		System.out.println("======");
//		al.clear();
//		System.out.println(al);
		System.out.println("======");
		
		System.out.println("al.get(3) = "+al.get(3));
		al.remove("red"); // Collection
		al.remove(0); // List
		System.out.println(al);
		al.removeAll(days);
		System.out.println(al);
		
	
		
	}
	
    
	
}
