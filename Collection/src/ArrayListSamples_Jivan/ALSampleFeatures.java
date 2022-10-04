package ArrayListSamples_Jivan;

import java.util.ArrayList;

public class ALSampleFeatures {
	
	public static void main(String[] args) {
		
	//	ArrayList al1 = new ArrayList(100);   // default capacity is 100
	
		ArrayList al = new ArrayList();    // default capacity is 10
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(10);
		al.add("DurgaPooja");
		al.add(null);

	//	System.out.println(al);   // [10,20,30,40]
		System.out.println(al);   // [10, 20, 30, 40, 10, DurgaPooja, null]

	}

}
