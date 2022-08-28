package damini_LinkedList;

public class Controller {
	public static void main(String[] args) {
		
		Employeequeue queue= new Employeequeue();
		
		Employee_Details e=new Employee_Details("Damini",2000,30);
		queue.push(e);
		
		Employee_Details e1=new Employee_Details("Durva",3000,40);
		queue.push(e1);
		
		Employee_Details e2=new Employee_Details("Payal",1000,50);
		queue.push(e2);
		
		Employee_Details e3=new Employee_Details("Sushma",5000,5);
		queue.push(e3);
		
		queue.viewQueue();
		
		System.out.println("-----------------");
		
		queue.pop();
		queue.pop();
		queue.pop();
		
		queue.viewQueue();
		
		
		
		
	}

}
