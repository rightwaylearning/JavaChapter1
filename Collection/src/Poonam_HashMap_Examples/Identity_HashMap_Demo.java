package Poonam_HashMap_Examples;

import java.util.HashMap;
import java.util.IdentityHashMap;

import Sonali_collection_All_Example.AssiMap12_9;

   public class Identity_HashMap_Demo {
	   
  public static void main(String[] args) {
	
	  
	  HashMap<Integer, String> map1 = new HashMap<>();
	    
	     Integer i= new Integer(10);
	     Integer j=new Integer(10);
	     
	     map1.put(i,"First");
	     map1.put(j,"First");
	     System.out.println(map1);
	     
	     System.out.println("*******************");
	     
	     IdentityHashMap<Integer, String> identy = new IdentityHashMap<>();
	     
	     identy.put(i,"First");
	     identy.put(j, "First");
	     
	     System.out.println(identy);
}
	     
	    
	   
	   
	   
	     
	 
}
