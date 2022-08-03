package Akshay_TypesOfVariable;

public class TypesOfVariable {
	
	public static void main(String[] args) {
		
		Test d = new Test ();
		d.a = 10;  // Instance Variable
		d.b = 20;  // Instance Variable
		
		Test.c = 150;  // Static Variable
		
		System.out.println("This is Instance Variable = "+d.a);
		
		Test d1 = new Test ();
		d.a = 20;  // Instance Variable
		d.b = 30;  // Instance Variable
		
		System.out.println("This is Static Variable used directly class 'Test.c' = "+Test.c);
		System.out.println("This is Static Variable used directly object 'd1.c' = "+ d1.c);
		System.out.println("=============================================================");
		
		Product farm = new Product ();
		
		System.out.println("Used without array for below program\n");
		
		farm.pack = "Milk"; // Instance Variable
		farm.qty = 20; // Instance Variable
		Product.name = "Sarda-Farms"; // Static Variable
		
		Product farm1 = new Product ();
		farm1.pack = "Curd";  // Instance Variable
		farm1.qty = 30; // Static Variable
		
		Product farm2 = new Product ();
		farm2.pack = "Butter";  //Instance Variable
		farm2.qty = 2;  //Static Variable
		
		farm.showDetils();
		farm1.showDetils();
		farm2.showDetils();
		
		Product[] akshay = new Product[3];
		
		akshay[0] = new Product();
		
		akshay[0].pack = "Milk";
		akshay[0].qty = 10;
		
		akshay[1] = new Product();
	
		akshay[1].pack = "Curd";
		akshay[1].qty = 20;
		
		akshay[2] = new Product();
		
		akshay[2].pack = "Butter";
		akshay[2].qty = 5;
		
		System.out.println("\nUsed Array for below details\n");
		for (int i=0; i<3; i++)	
		akshay[i].showDetils();
		
		}
	}
