package Sonali_collection_All_Example;

import java.util.LinkedList;

public class OuequImplementInLL {
	
	LinkedList<Integer> list;
	OuequImplementInLL(){
		this.list = new LinkedList<>();
	}
	public static void main(String[] args) {
		 OuequImplementInLL  queqe = new  OuequImplementInLL ();
		 
	}
  void addObject(Integer i) {
	  this.list.addLast(i);
  }

  Integer getObject(Integer i) {
	  if(this.list.isEmpty()) {
		  return null;
	  }
	  else {
		  return this.list.removeFirst();
	  
}
}
}