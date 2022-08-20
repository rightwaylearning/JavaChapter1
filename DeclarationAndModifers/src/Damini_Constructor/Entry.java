package Damini_Constructor;

public class Entry {

	public static void main(String[] args) {
		
		Student s=new Student("Damini",25,"1st",'A');
		s.Name="d";
		s.rollNumber=35;
		s.std="2nd";
		s.div='C';
		
		s.setName("fsd");
		System.out.println(s.Name);
		
		
				
		Student a1=new Student();
		a1.setName("dsa");
		a1.setRollNumber(23);
		a1.setStd("5th");
		a1.setDiv('a');
		
				
	}
}
