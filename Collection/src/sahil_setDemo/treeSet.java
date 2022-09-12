package sahil_setDemo;


import java.util.Comparator;
import java.util.TreeSet;

public class treeSet {
public static void main(String[] args) {
	TreeSet<Integer> a = new TreeSet<>(new MyOwnSorting());
	a.add(10);
	a.add(80);
	a.add(40);
	a.add(30);
	a.add(10);
	a.add(70);
	System.out.println(a);
	System.out.println("=========================");
System.out.println(a);
}
}
class MyOwnSorting implements Comparator{
	
	public int compare(Object o1, Object o2) {
		
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		
		if(i1 < i2) {
			return 1;
		}else if(i1 > i2) {
			return -1;
		}else {
			return 0;
		}
	}
}
