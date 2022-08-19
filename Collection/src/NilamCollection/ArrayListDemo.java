package NilamCollection;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		ArrayList al = new ArrayList(20);
		 al.add(20);
		 al.add("abc");
		 al.add(46);
		 al.add('D');
		 al.add("40");
		 al.add(30);
		 
		 System.out.println(al);
		 System.out.println(al.size());
		 System.out.println(al.remove(1));
		 System.out.println(al);
		 System.out.println(al.isEmpty());
	}

}
