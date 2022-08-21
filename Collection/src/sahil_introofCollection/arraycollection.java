package sahil_introofCollection;

import java.util.ArrayList;

public class arraycollection {
	public static void main(String[] args) {
		ArrayList s = new ArrayList(14);
		
		s.add(55445);
		s.add("sahil");
		s.add(14);
		s.add(15);
		s.add(16);
		s.add(17);
		s.add("akshay");
		s.add(18);
		s.add(19);
		s.add(20);
		s.add(30);
		s.add(52);
    	s.add(60);
		
		System.out.println(s.size());
		System.out.println(s);
		
		
		System.out.println(s);
		System.out.println(s.size());
		System.out.println(s.isEmpty());
		//s.clear();
		
		System.out.println(s);
		System.out.println(s.size());
		System.out.println(s.isEmpty());
		
		ArrayList s1 = new ArrayList(20);
		s.add(s1);
		s1.add(20);
		s1.add(52);
		s1.add(25);
		System.out.println(s);
		System.out.println(s.add(s1));
		System.out.println(s.size());
	}

}
