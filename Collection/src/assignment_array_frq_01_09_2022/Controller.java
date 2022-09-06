package assignment_array_frq_01_09_2022;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Controller {

	public static void main(String[] args) {
		
		// input
		int[] input = {10,20,10,30,40,30,10,70,90,20};
		// output 
		List<Fr> storage = new ArrayList<>();
		
		for(int item:input) {
			
			boolean flag = checkNumberIsPresent(item,storage);
			
			if(flag == false) {
				Fr obj =new Fr(item,1);
				storage.add(obj);
			}
		}
		
		System.out.println(storage);
			
	}
	
	static  boolean checkNumberIsPresent(int item,List<Fr> storage) {
		
		ListIterator<Fr> itr = storage.listIterator();
		
		while(itr.hasNext()) {
			Fr obj = itr.next();
			if(item == obj.getItem()) {
				Integer count = obj.getCount();
				count++;
				
				Fr new1= new Fr(item,count);
				
				
				
				
				itr.set(new1);
				return true;
			}
		}
		
		return false;
	}
}
