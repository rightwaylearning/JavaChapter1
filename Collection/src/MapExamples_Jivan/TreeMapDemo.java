package MapExamples_Jivan;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {
	
	public static void main(String[] args) {
		
		TreeMap<String, Integer> map = new TreeMap();
		
		map.put("ff", 1);
		map.put("hh", 5);
		map.put("hh", 7);
		map.put("ll", 1);
		map.put("ss", 1);
		
		System.out.println(map);
		
		TreeMap<String, Integer> map1 = new TreeMap(new MyWaySorting());
		map1.put("zz", 1);
		map1.put("mm", 11);
		map1.put("ll", 12);
		map1.put("bb", 13);
		map1.put("rr", 14);
		
		System.out.println(map1);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		TreeMap<Student1, Integer> obj = new TreeMap<>();
		obj.put(new Student1(12, "SS"), 12);
		obj.put(new Student1(12, "MM"), 13);
		obj.put(new Student1(12, "LL"), 14);
		obj.put(new Student1(12, "TT"), 15);
		obj.put(new Student1(12, "ZZ"), 16);
		
		System.out.println(obj);
	}

}

class MyWaySorting implements Comparator<String> {
	
	@Override
	public int compare(String o1, String o2) {
		
		return -o1.compareTo(o2);
		
	}
}

