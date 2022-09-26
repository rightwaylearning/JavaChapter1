package Nilam_map_Example;

import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<>();
		hmap.put(1, "abc ");
		hmap.put(2, "abc ");
		hmap.put(3, "fff ");
		hmap.put(4, "ggg ");
		hmap.put(5, "hhh ");
		hmap.put(6, "jjj ");
		System.out.println(hmap);

		HashMap<Student2, String> hmap1 = new HashMap<>();
		hmap1.put(new Student2(10,"Ajit"), "aa");
		hmap1.put(new Student2(10,"Ajit"), "dd ");
		hmap1.put(new Student2(11,"Advik"), "cc");
		hmap1.put(new Student2(12,"Omkar"), "ee");
		hmap1.put(new Student2(13,"Shubham"), "gg");
		System.out.println(hmap1.size());
		System.out.println(hmap1);
		
	}

}

class Student2 {

	Integer rollNumber;
	String name;

	public Student2(Integer rollNumber, String name) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
	}

	@Override
	public String toString() {
		return " [" + rollNumber + " " + name + "]";

	}

	@Override
	public int hashCode() {
		return this.rollNumber.hashCode() + this.name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Student2 s = (Student2) obj;
		if (this.rollNumber.equals(s.rollNumber) && this.name.equals(s.name)) {
			return true;
		}
		return false;
	}
}