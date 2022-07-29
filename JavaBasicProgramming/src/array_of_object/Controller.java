package array_of_object;

public class Controller {
	public static void main(String[] args) {

		Employee e = new Employee();
		
		e.name = "Saket";
		e.empId = 4213;
		e.designation = "Software developer";
		
		e.address = new Address();
			e.address.cityname = "Hyd";
			e.address.pinCode = 452311;
		//--------------------------------------	
				Company cmp  = new Company();
			        cmp.name ="IBM";
			        cmp.registrationNumber = 46326;
				        cmp.address = new Address();
				        cmp.address.cityname = "Pune";
				        cmp.address.pinCode = 412356;
		e.company = cmp;
		
		Employee[] arr = new Employee[5];
		arr[0]= e;
		
		System.out.println(e.designation);
		
	}
}
