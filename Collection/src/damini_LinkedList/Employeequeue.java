package damini_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Employeequeue {
	private LinkedList<Employee_Details> queue;
	
	Employeequeue()
	{
		this.queue= new LinkedList<Employee_Details>();
	}
	public void push(Employee_Details data)
	{
		if(data!=null)
			this.queue.addLast(data);
	}
	

public Employee_Details pop()
{
	if(this.queue.isEmpty())
	{
		System.out.println("sorry stack is empty");
		return null;
	}else
	{
		return this.queue.removeLast();
	}
	
	}
public void viewQueue()
{
	Iterator<Employee_Details> itr=this.queue.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	}

    

}
