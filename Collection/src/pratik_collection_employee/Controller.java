package pratik_collection_employee;

public class Controller {
	public static void main(String[] args) {
		Employee e=new Employee("frank",29,10000.0);
		EmployeeInfo em=new EmployeeInfo();
	em.addData(e);
	Employee e1=new Employee("allen",23,20000.0);
	em.addData(e1);
	Employee e3=new Employee("jon",23,5000.0);
	em.addData(e3);
	
	em.view();
	em.afterAddGetEmpDeatils();;
		
		
	}
}
