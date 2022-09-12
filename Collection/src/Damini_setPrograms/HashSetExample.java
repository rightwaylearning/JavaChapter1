package Damini_setPrograms;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<student> set=new HashSet<>();
		set.add(new student(10));
		System.out.println(set.add(new student(10)));
		System.out.println(set.size());
	}
}

class student
{
	Integer i;
	student(Integer i)
	{
		this.i=i;
	}
	@Override
	public int hashCode() {
		
		return this.i;
	}
	@Override
	public boolean equals(Object obj) {
		student s=(student)obj;
		return this.i.equals(s.i);
	}
	
	}


	
	
	
			
	
