package Akshay_Class_Dependancy;

public class Controller {
	
	public static void main(String[] args) {
		
		Studentinfo p = new Studentinfo();
		
		p.StudentName = "Akshay Tejale";
		p.RollNumber = 10;
		
		p.addr = new Address ();
		p.addr.Roadname = "Karve Road";
		p.addr.pincode = 422;
		
		System.out.println("Student Name is = "+ p.StudentName);
		System.out.println("Student RollNum is = "+p.RollNumber);
		System.out.println("Student Address is = "+p.addr.Roadname);
		System.out.println("Student Pincode is = "+p.addr.pincode);
		
//		System.out.println(s.StudentName);
//		System.out.println(s.RollNumber);
//		System.out.println(s.addr.Roadname);
//		System.out.println(s.addr.pincode);
	}

}
