package TypesOfVariables;

public class TypesOfVaribaleExample {

	public static void main(String[] args) {
		
		Test t = new Test();
		t.a = 10;
		t.b = 20;
		
		t.c =200;
		
		Test t1 = new Test();
		t1.a =40;
		t1.b =50;
		//System.out.println(t1.a);
		System.out.println(t1.c);
		
		Test t2 = new Test();
		System.out.println(t2.c);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		// static
		Student.schoolName = "Right way Learning";
		
		Student akshay = new Student();
		akshay.name = "Akshay";
		akshay.rollNumber = 23;
		
		
		Student poonam = new Student();
		poonam.name = "Poonam Jadhav";
		poonam.rollNumber = 24;
		
		
		Student kalpesh = new Student();
		kalpesh.name = "Kalpesh jadhav";
		kalpesh.rollNumber = 25;
		
		
		
	}
}
