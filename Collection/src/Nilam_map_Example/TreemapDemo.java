package Nilam_map_Example;

import java.util.Comparator;
import java.util.TreeMap;

public class TreemapDemo {
	
	public static void main(String[] args) {
		// DNSO >>>>> Bz String class implements Comparable
		TreeMap<String, Integer> tmap = new TreeMap<>();
		tmap.put("AA", 1);
		tmap.put("AA", 2);
		tmap.put("BB", 3);
		tmap.put("NN", 4);
		tmap.put("ZZ", 1);
		tmap.put("TT", 1);
		System.out.println(tmap.size());
		System.out.println(tmap);
		
		// dec order
		TreeMap<String, Integer> tmap1 = new TreeMap<>(new myownsorting1());
		tmap1.put("AA", 11);
		tmap1.put("AA", 22);
		tmap1.put("BB", 33);
		tmap1.put("NN", 44);
		tmap1.put("ZZ", 13);
		tmap1.put("TT", 1);
		System.out.println(tmap1.size());
		System.out.println(tmap1);
		
		
		
		//for custom key student
		TreeMap<Studentinfo, Integer> tmap2 = new TreeMap<>(new myownsortingimpl1());
		tmap2.put(new Studentinfo(10,"omkar") , 1);
		tmap2.put(new Studentinfo(11,"shubham") , 1);
		tmap2.put(new Studentinfo(12,"ajit") , 1);
		tmap2.put(new Studentinfo(13,"advik") , 1);
		tmap2.put(new Studentinfo(14,"sanskar") , 1);
		
		System.out.println(tmap2.size());
		System.out.println(tmap2);
	}

}
class myownsorting1 implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return -o1.compareTo(o2);  
		
	}
	
}
 class Studentinfo1 implements Comparable<Studentinfo>{
	 
	 Integer rollNumber;
	 String name;
	public Studentinfo1(Integer rollNumber, String name) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
	}
	@Override
	public String toString() {
		return " [" + rollNumber + " " + name + "]";
	}
	@Override
	public int compareTo(Studentinfo o) {
		return this.name.compareTo(o.name);
	 
	
 }
 }
 class myownsortingimpl1 implements Comparator <Studentinfo>{

	@Override
	public int compare(Studentinfo o1, Studentinfo o2) {
		return -o1.compareTo(o2);
	}
 }
