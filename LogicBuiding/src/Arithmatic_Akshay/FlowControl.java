package Arithmatic_Akshay;

public class FlowControl {

	public static void main(String[] args) {
		
		double salary = 290000;
		BackCriteria obj = new BackCriteria();
		
		System.out.println("Salary is = 290000");
		
		if (obj.EligibleEmployye(salary)) {
			
			System.out.println("Kindly try in city bank for saving account");
		}
		
			else
			{
				System.out.println("You can try in State Bank of India");
			}
		
		System.out.println("Your A/c is open");
		System.out.println("------------------------------------------");
		
		double minSalary = 20000;
		BackCriteria obj1 = new BackCriteria ();
		
		System.out.println("Salary is = 20000");
		
		if (obj.EligibleEmployye(minSalary)) {
			
			System.out.println("Kindly try in City Bank for Saving account");
		}
		else
		{
			System.out.println("You can try in State bank of India");
		}
		System.out.println("Your A/c is open");
		System.out.println("------------------------------------------");	
	}
}
