package Map_damini;

import java.util.ArrayList;
import java.util.HashMap;

public class Assignment14_09 {
public static void main(String[] args) {
	
	ArrayList<Student> al=new ArrayList<>();
	al.add(new Student(1,"S"));
	al.add(new Student(2,"aa"));
	al.add(new Student(4,"rr"));
	al.add(new Student(5,"yy"));
	al.add(new Student(6,"uu"));
	
	HashMap<String, Integer> map=new HashMap<>();
	for(Student s:al)
	{
		if(map.containsKey(s.Name));
		{
		Integer count=map.get(s.Name);
		count++;
		map.put(s.Name, count);
		}
		else
		{
			map.put(s.Name,1);
		}
	}
	System.out.println(map);

}
class Student
{
	Integer rollNumber;
    String Name;
	public Student(Integer rollNumber, String Name) {
		
		this.rollNumber = rollNumber;
		Name = Name;
	}
    
	}
}