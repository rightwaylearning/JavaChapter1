package nilam_class_property;

public class Controller {
	
	public static void main(String[] args) {
		
		Student s = new Student();
		s.name= "abc";
		s.rollNumber= 2;
		s.clgName="fc";
		s.std ="5th";
		
		s.add =new Address();
		s.add.hNumber="B-102";
		s.add.area="kharadi";
		s.add.city="pune";
		s.add.pincode=411014;
	
		String [] s1 = {"ab","ac","ad","af"};
		s.subject = s1;

		Show_details d1=new Show_details();
		d1.displayInfo(s);
		
			
		
		
	
		

	}

}
