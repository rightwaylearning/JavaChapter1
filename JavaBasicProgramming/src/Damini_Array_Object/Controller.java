package Damini_Array_Object;

public class Controller {

	public static void main(String[] args) {
		Employee e=new Employee();
		
		e.name="damini";
		e.empid=45;
		e.designation="Trainee";
		e.address=new Address();
		    
		   e.address.cityname="Mehsana";
		   e.address.pincode=384002;
		   
		   //-----------------------------
		   Company c=new Company();
		      c.name="TCS";
		      c.RegistrationNumber=567;
		      
		      c.address=new Address();
		      c.address.cityname="Ahmedabad";
		      c.address.pincode=324567;
		      
		    e.company=c;
		    
		    
		    Employee[] ar=new Employee[5];
		    
		    ar[0]=e;
		    System.out.println(e.designation);
		    System.out.println(e.empid);
		    System.out.println(e.name);
		    System.out.println(e.address.cityname);
		    System.out.println(e.address.pincode);
		    System.out.println(e.company.address.cityname);
		    System.out.println(e.company.address.pincode);
		    
		   
	}
}
