package TreeSet_Damini;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemoComparator {

	public static void main(String[] args) {
		TreeSet<Integer> t=new TreeSet<>();
		t.add(100);
		t.add(90);
		t.add(40);
		t.add(30);
		System.out.println(t);
	}
}
class Mysorttech implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		Integer i=(Integer)o1;
		Integer i1=(Integer)o2;
		if(i<i1)
		{
		return 1;
		}
		else if(i>i1)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	
	}
