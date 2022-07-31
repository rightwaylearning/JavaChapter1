package arithmatic_operation;

public class FlowControll {

	public static void main(String[] args) {
		
		double salary = 29000.00;
		BackCritea obj = new BackCritea();
		
		 if(obj.isValidEmployeeForSalaryAcc(salary)) {
			System.out.println("please try in city bank for saving account");
		}else {
			System.out.println("You can try in SBI");
		}
		 
		 System.out.println("account is open");
	}
	
	
}
