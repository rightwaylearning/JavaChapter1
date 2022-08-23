package sahil_introofCollection;

import java.util.ArrayList;

public class allVies {
  private static Object[] al;

public static void main(String[] args) {
	ArrayList a1 = new ArrayList ();
	a1.add(20);
	a1.add("sahil");
	a1.add(30);
	a1.add(40);
	a1.add(50);
	a1.add(60);
	a1.add(70);
	a1.add("akshay");
	
	System.out.println(a1.size());
	
	ArrayList a2 = new ArrayList();
	a2.add("LMD");
	a2.add("rahul");
	a2.add(100);
	a2.add(200);
	a2.add(300);
	
	a1.addAll(a2);
	System.out.println(a1);
	System.out.println("==========================");
	
	
	while(itr.hasNext()) {
		Integer i = itr.next();
		if(i % 2 == 0) {
		  itr.remove();
		}
	}
	System.out.println("=======================");
     System.out.println(a1.size());
     System.out.println("=======================");
     
     
     int i=0;
     while(i<a1.size()) {
    	 System.out.println(a1.get(i));
    	 i++;
     }
   
		System.out.println("**********************");
		
		for(Object o:a1) {
			System.out.println(o);
		}

		
}
}
