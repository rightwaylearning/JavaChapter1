package Akshay_Iterator_Assignments;

public class Array_Controller {
	
	public static void main(String[] args) {
		
		System.out.println("\nThis is Simple Arrray Program");
		System.out.println("--------------------------------------------------------------------");
		
		Array_Employee [] c = new Array_Employee [4];
		
		c [0] = new Array_Employee ();
		
		c[0].employeeid = 10;
		c[0].employeename = "Akshay Tejale";
		c[0].salary = 20000.00;
		
		c[1] = new Array_Employee ();
		
		c[1].employeeid = 11;
		c[1].employeename = "Sahil Bagade";
		c[1].salary = 18000.00;
		
		c[2] = new Array_Employee ();
		
		c[2].employeeid = 12;
		c[2].employeename = "Poonam Jadhav";
		c[2].salary = 25000.00;
		
		c[3] = new Array_Employee ();
		
		c[3].employeeid = 13;
		c[3].employeename = "Vishal Nagavde";
		c[3].salary = 30000.00;
	
		for (int i = 0; i < 4; i++)
		
		c[i].showDetails();
			
		}
	}

