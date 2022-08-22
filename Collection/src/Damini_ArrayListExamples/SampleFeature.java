package Damini_ArrayListExamples;

import java.util.ArrayList;

public class SampleFeature {
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(30);
		al.add("Damini");
		al.add(40);
		
		al.add(40);
		al.add(null);
		System.out.println(al);//Allow duplicate Object & null also
	}

}
