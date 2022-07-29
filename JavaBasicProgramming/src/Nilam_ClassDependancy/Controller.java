package Nilam_ClassDependancy;

public class Controller {
	public static void main(String[]arg) {
		Student s = new Student();
		s.name ="abc";
		s.rollNumber= 19;
		s.ClgName= "fc";
		   
		     Address a =new Address();
		     a.cityName = "pune";
		     a.pinCode= 12345;
		      s.addr = a;
		      
		      
		      
		      System.out.println(s.name);
		      System.out.println(s.rollNumber);
		      System.out.println(s.ClgName);
		      System.out.println(s.addr.cityName);
		      System.out.println(s.addr.pinCode);
	}
	

}
