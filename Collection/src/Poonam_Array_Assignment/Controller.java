package Poonam_Array_Assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Controller {

	public static void main(String[] args) {
		
		int[] input= {10,20,30,40,10,20,50,90,60,70,80,40,60,50};
		
		List<Array_freq_Check_Demo> storage = new ArrayList<>();
		
	    for (int item:input) {
			
	    	boolean flag = checkNumRepeatation(item,storage);
	    	
	    	if(flag == false) {
	    		
	    		Array_freq_Check_Demo obj = new Array_freq_Check_Demo(item,1);
	    		storage.add(obj);
	    	   }
	    	}
	          System.out.println(storage);
	    
	     }
	static boolean checkNumRepeatation(int item,List<Array_freq_Check_Demo> storage)
	{
		ListIterator<Array_freq_Check_Demo>itr = storage.listIterator();
		
		while(itr.hasNext())
		{
			Array_freq_Check_Demo obj = itr.next();
			if(item == obj.getItem())
			{
				Integer count = obj.getCount();
				count++;
				
				Array_freq_Check_Demo new1 = new Array_freq_Check_Demo(item , count);
				itr.set(new1);
				return true;
			}			
		}
		return false;	
	}
	}

