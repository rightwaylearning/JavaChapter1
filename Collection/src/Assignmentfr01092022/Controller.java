package Assignmentfr01092022;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Controller {

	public static void main(String[] args) {
		
		int[] input= {20,30,40,50,30,50};
		
		List<CountNumber> storage=new ArrayList<>();
		
		for(int item:input)
		{
			boolean flag=checknumberispresent(item,storage);
			if(flag==false)
			{
				CountNumber obj=new CountNumber(item,1);
			    storage.add(obj);
			    
		}
	}
	System.out.println(storage);
	
	
}
static boolean checknumberispresent(int item,List<CountNumber> storage)
{
	ListIterator<CountNumber> itr=storage.listIterator();
	
	while(itr.hasNext())
	{
		CountNumber obj = itr.next();
	if(item == obj.getItem()) {
		Integer count = obj.getCount();
		count++;
		
		CountNumber new1= new CountNumber(item,count);
		itr.set(new1);
		return true;
	}
	
	
	return false;

}
	return false;
}
}
	

