package sahil_collection;

import java.util.TreeSet;

public class student {
public static void main(String[] args) {
	TreeSet num = new TreeSet();
	num.add(10);
	num.add(50);
	num.add(00);
	num.add(20);
	num.add(10);
// dublicate not allowed
	System.out.println(num);
	
	TreeSet<String> t = new TreeSet<String>();
	t.add("MM");
	t.add("zz");
	t.add("aa");
	t.add("aM");
	System.out.println(t.size());
	System.out.println(t);
	
	Integer i = new Integer(10);
	Integer j = new Integer(10);
	int r = i.compareTo(j);
	System.out.println(r);
	
	
}
}
