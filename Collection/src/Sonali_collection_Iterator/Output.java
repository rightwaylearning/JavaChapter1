package Sonali_collection_Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import assignment_array_frq_01_09_2022.Fr;

public class Output {
	
	public static void main(String[] args) {
		
		int [] arr = {10,20,3,4,5,4,5,3,5,4,3,5,};
		
		List<FrequencyExample> storage = new ArrayList<>();
		
		for(Integer Number:arr) {
			boolean flag=checkNumberIsPresent(Number,storage);
			if(flag==false) {
				FrequencyExample obj = new FrequencyExample(Number,1);
			  storage.add(obj);
			}
				
			}
	System.out.println(storage);
	}
		
		static  boolean checkNumberIsPresent(int Number,List<FrequencyExample> storage) {
			ListIterator<FrequencyExample> itr = storage.listIterator();{
			while(itr.hasNext()) {
				FrequencyExample obj =itr.next();
				if(Number == obj.getNumber()) {
					Integer count = obj.getCount();
					count++;
					
					FrequencyExample new1 = new FrequencyExample(Number,count);
					itr.set(new1);
					return true;
			}
			
	}
			return false;
			}
}
}
