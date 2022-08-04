package Damini_TypesOfVariable;

public class Collage {

	int Number;
	String Name;
	static String CollegeName;
	
	void Print()
	{
		
		System.out.println(Number);
		System.out.println(Name);
		System.out.println(CollegeName);
		instancemethod();
		staticmethod();
	}
	
	
	static void Show()
	{
		
		System.out.println(CollegeName);
		staticmethod();
		
		Collage c=new Collage();
		System.out.println(c.Name);
		System.out.println(c.Number);
		c.instancemethod();
		
	}
	void instancemethod() {}
	static void staticmethod(){}
	
}
