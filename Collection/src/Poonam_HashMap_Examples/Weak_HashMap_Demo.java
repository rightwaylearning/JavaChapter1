package Poonam_HashMap_Examples;

import java.util.WeakHashMap;
import java.util.ArrayList;

public class Weak_HashMap_Demo {
	
	public static void main(String[] args) throws Exception {
		
		
    	WeakHashMap<Test1, Integer> map=new WeakHashMap<>();
    	Test1 t =new Test1(10);
		map.put(t, 1000);
		t=null;
		
		System.gc();
		Thread.sleep(5000);
		
		System.out.println(map);		
		
	}

}

  class Test1{
	  int i;
	  Test1(int i){
		  
		  this.i=i;
	  }
	@Override
	public String toString() {
		return ""+this.i;
	}
	
	@Override
	public void finalize() throws Throwable {
		System.out.println("*****Done my work.");
	}
	  
  }