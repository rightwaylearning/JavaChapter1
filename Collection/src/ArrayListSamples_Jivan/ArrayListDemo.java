package ArrayListSamples_Jivan;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		
			ArrayList smallList = new ArrayList();
				smallList.add("AB");
				smallList.add("LM");
			
		al.addAll(smallList);	
		al.add(30);
		System.out.println(al);          // [10, 20,30,AB, LM, 30]
		
		al.remove(Integer.valueOf(30));
		System.out.println(al);          // [10, 20, AB, LM, 30]
		
		ArrayList al1 = new ArrayList();
		al1.add(30);
		al1.add(20);
		
		al.removeAll(al1);
		System.out.println(al);           // [10, AB, LM]
		

		al.removeAll(smallList);
		System.out.println(al);           // [10]
		
	}

}
