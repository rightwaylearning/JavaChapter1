package Sonali_collection_Iterator;



public class Controller1 {

	public static void main(String[] args) {
		
	
		EmployeeModel[] arr = new EmployeeModel[5] ; 
	
		arr[0] = new EmployeeModel("sonali",21,22300.0); 
		
		
		
		arr[1] = new  EmployeeModel("Pinki",23,12300.0);
		
		
		arr[2] = new EmployeeModel("Priya",22,25500.0); 
		
		
		arr[3] = new EmployeeModel("Priti",24,18600.0); 
		
		
		arr[4] = new EmployeeModel("Rani",26,17600.0); 
		
		ShowList.show(arr);
	
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i].getEmpSalary()<=25000.0) {
				Double updatedSalary = arr[i].getEmpSalary() + (arr[i].getEmpSalary() * 10/100);
				arr[i].setEmpSalary(updatedSalary);}
				else if (arr[i].getEmpSalary()>=25000.00) {
					Double updatedSalary = arr[i].getEmpSalary() + (arr[i].getEmpSalary() * 5/100);
					arr[i].setEmpSalary(updatedSalary);}
					
				else {
					Double updatedSalary = arr[i].getEmpSalary() + (arr[i].getEmpSalary() * 2/100);
				arr[i].setEmpSalary(updatedSalary);{
				
				}
				
				}
			System.out.println("-------------------------------");
			ShowList.show(arr);
		}
		
	}
}
