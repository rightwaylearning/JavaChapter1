package Damini_Hashset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetDemo {
	
	public static void main(String[] args) {
		
		Set<Integer> s=new HashSet<>();
		
		s.add(10);
		s.add(30);
	    s.add(40);
	    s.add(10);
	    s.add(40);
	    s.add(20);
	    
	    System.out.println(s.size());
	    System.out.println(s);
		
	}
	LinkedHashSet<Integer> lh=new LinkedHashSet<Integer>();
      
      
	//----------------------
	
	int[] arr = {10,20,30,45,89,45,10,10,30};
	// 10,20,30,45,89
	// 45,10,30
	// remove duplicate & tell me which are duplicate number
	
    LinkedHashSet<Integer> UniqueItem=new LinkedHashSet<>();
    LinkedHashSet<Integer> DuplicateItem=new LinkedHashSet<>();
    
    for(int i:arr)
    {
    	boolean flag=UniqueItem.add(i);
    	
    	
    	if(flag==false)
    	{
    		DuplicateItem.add(i);
    	}
    	
    	System.out.println(UniqueItem);
    	System.out.println(DuplicateItem);
    }
  
    
    
}
}