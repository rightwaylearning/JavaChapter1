package ArrayListExamples;

import java.util.ArrayList;

public class ALDemo {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(30);
		al.add(10);
		al.add(20);
		
		     ArrayList smallList = new ArrayList();
			     smallList.add("AB");
			     smallList.add("LM");
			     
	   al.addAll(smallList); 
	   al.add(30);
	   System.out.println(al);
	   
	   al.remove(Integer.valueOf(30));
	   System.out.println(al);
	   
	   
	   ArrayList rm = new ArrayList();
	   rm.add(30);
	   rm.add(20);
	   
	   al.removeAll(rm);
	   System.out.println(al);
	   
	   al.removeAll(smallList);
	   System.out.println(al);
	   
	}
}
