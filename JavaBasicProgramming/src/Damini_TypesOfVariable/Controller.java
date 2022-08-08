package Damini_TypesOfVariable;

public class Controller {

	void s1()
	
	{
		Collage c=new Collage();
		System.out.println(c.Name);
		System.out.println(c.Number);
		System.out.println(Collage.CollegeName);
		c.Print();
		c.instancemethod();
		Collage.Show();
		Collage.staticmethod();
	}

	
	static void s2()
	{
		Collage c=new Collage();
		System.out.println(c.Name);
		System.out.println(c.Number);
		System.out.println(Collage.CollegeName);
		c.Print();
		c.instancemethod();
		Collage.Show();
		Collage.staticmethod();
	}
	
	public static void main(String[] args) {
		Controller c=new Controller();
		c.s1();
		Controller.s2();
		System.out.println();
		
	}
		
	}

