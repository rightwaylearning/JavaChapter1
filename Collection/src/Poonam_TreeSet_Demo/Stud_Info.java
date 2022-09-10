package Poonam_TreeSet_Demo;

import java.util.Objects;

import SetPrograms.StudentInfo;

public class Stud_Info implements Comparable {

	private String firstName;
	private String lastName;
	
	public Stud_Info() {	}
	
	public Stud_Info(String firstName,String lastName) {
		
		this.firstName=firstName;
		this.lastName=lastName;
		
	}
	
	
	
	@Override
	public String toString() {
		return "Stud_Info [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	
	
		@Override
	public int hashCode() {
		//return Objects.hash(firstName, lastName);
		return this.firstName.hashCode() + this.lastName.hashCode();
	}

		public boolean equals(Object obj) {
			Stud_Info other = (Stud_Info) obj;
			if(this.firstName.equals(other.firstName) && this.lastName.equals(other.lastName))
			{
	return true;
			}

return false;
	}
		
    
    
	@Override
	public int compareTo(Object o) {
		Stud_Info s =(Stud_Info)o;
		  int n = this.firstName.compareTo(s.firstName); 
		  if(n == 0) {
			n= this.lastName.compareTo(s.lastName);
		  }
		return n;
	}
	}

