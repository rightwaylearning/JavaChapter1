package sahil_introofCollection;

import java.util.ArrayList;

public class arrayListExamoles {
	public static void main(String[] args) {
		
		ArrayList s = new ArrayList ();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add("sahil");
		s.add(null);
		s.add("good moring nagpur");
		System.out.println(s);
		System.out.println(s.size());
		
		ArrayList s1 = new ArrayList();
		s1.add(20);
		s1.add("akshy");
		s1.add("good night nagpur");
		s1.add(null);

		s.addAll(s1);
		System.out.println(s);
		System.out.println(s.size());
		
		   s.remove(Integer.valueOf(30));
		   System.out.println(s);
		   s.removeAll(s1);
		  System.out.println(s);
		  s.addAll(s1);
		  System.out.println(s);
		  s.add(Integer.valueOf(30));
		  System.out.println(s);
		   

           
	}

}
