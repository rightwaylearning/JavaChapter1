package Damini_TypesOfVariable;

public class TypesOfVariable {
	public static void main(String[] args) {
		
		Test t=new Test();
		t.a=10;
		t.b=20;
		
		Test.c=40;//access using class name because of static variable
		
		Test t1=new Test();
		t1.a=80;
		t1.b=70;
		
		System.out.println(t1.c);
		
		Test t2=new Test();
		System.out.println(t2.c);
		
		System.out.println("------------------");
		
		//static
		
		Student.collegeName="SK Patel Enggineering";
		
		Student d=new Student();
		d.Name="Damini";
		d.rollNumber=25;
		
		Student a=new Student();
		a.Name="Durva";
		a.rollNumber=21;
		
		Student e=new Student();
		e.Name="Amar";
		e.rollNumber=25;
		
		
		System.out.println(d.collegeName);

		
	}

}
