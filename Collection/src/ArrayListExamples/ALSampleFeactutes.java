package ArrayListExamples;

import java.util.ArrayList;

public class ALSampleFeactutes {

	public static void main(String[] args) {
		
		
		//ArrayList al1 = new ArrayList(100); // capacity = 100
		ArrayList al = new ArrayList();  // default capacity  = 10
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(10);
		al.add("durga pooja");
		al.add(null);
		
		System.out.println(al); 
		// [10, 20, 30, 40, 10, durga pooja, null]
	}
}
