package MapExamples_Jivan;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		TreeSet<StringBuilder> tree = new TreeSet();
		tree.add(new StringBuilder("Rohit"));
		tree.add(new StringBuilder("Rahul"));
		tree.add(new StringBuilder("Virat"));
		tree.add(new StringBuilder("Sky"));
		tree.add(new StringBuilder("Hardik"));
		tree.add(new StringBuilder("DK"));
		
		System.out.println(tree);
		
	}

}

class Student1 implements Comparable
{
	Integer RollNumber;
	String Name;
	public Student1(Integer rollNumber, String name) {
		super();
		RollNumber = rollNumber;
		Name = name;
	}
	@Override
	public String toString() {
		return " [" + RollNumber + "," + Name + "]";
	}
	@Override
	public int compareTo(Object o) {
		Student1 s=(Student1)o;
		return this.Name.compareTo(s.Name);
	}
	
	}
class Myownway implements Comparator<Student1>
{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		
		return o1.RollNumber.compareTo(o2.RollNumber);
	}
	}
class mywaysorting implements Comparator<String>
{

	@Override
	public int compare(String o1, String o2) {
	
		return -o1.compareTo(o2);
	}
	
	}

