package Map_damini;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeSetDemo {
public static void main(String[] args) {
	
	TreeMap<String,Integer> Tree =new TreeMap<>();
	Tree.put("aa", 10);
	Tree.put("SS", 10);
	Tree.put("DD", 10);
	Tree.put("WW", 10);
	Tree.put("RR", 10);
	Tree.put("bb", 10);
	
	System.out.println(Tree);
	System.out.println("--------------------------");
	
	TreeMap<String,Integer> Tree1 =new TreeMap<>(new mywaysorting());
	Tree1.put("aa", 10);
	Tree1.put("SS", 10);
	Tree1.put("DD", 10);
	Tree1.put("WW", 10);
	Tree1.put("RR", 10);
	Tree1.put("bb", 10);
	
	System.out.println(Tree1);
	System.out.println("-------------------------------");
	TreeMap<Student12,Integer> obj=new TreeMap<>(new Myownway() );
	obj.put(new Student12(1,"FF"),12);
	obj.put(new Student12(2,"gF"),14);
	obj.put(new Student12(4,"fg"),13);
	obj.put(new Student12(5,"ty"),2);
	obj.put(new Student12(3,"ss"),1);

	System.out.println(obj);
}
}
class Student12 implements Comparable
{
	Integer RollNumber;
	String Name;
	public Student12(Integer rollNumber, String name) {
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
		Student12 s=(Student12)o;
		return this.Name.compareTo(s.Name);
	}
	
	}
class Myownway implements Comparator<Student12>
{

	@Override
	public int compare(Student12 o1, Student12 o2) {
		
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
