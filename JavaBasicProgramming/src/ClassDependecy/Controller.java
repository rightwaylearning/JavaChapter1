package ClassDependecy;

public class Controller {
	
	public static void main(String[] args) {

		Student s= new Student();
		
		 s.name = "Animesh";
		 s.rollNumber = 23;
		 s.clgName = "FC";
		 
		 s.addr = new Address();
						 s.addr.cityName = "Pune";
						 s.addr.pinCode = 123456;
		 // ------------------------------------
						 
		           Address  add = new Address();
		              add.cityName = "Mumbai";
		              add.pinCode = 6747474;
		 
		 s.addr = add;
				 
		 System.out.println(s.name);
		 System.out.println(s.rollNumber);
		 System.out.println(s.clgName);
		 System.out.println(s.addr.cityName);
		 System.out.println(s.addr.pinCode);
		
	}
}
