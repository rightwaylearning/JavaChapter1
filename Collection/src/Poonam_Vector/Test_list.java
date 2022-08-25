package Poonam_Vector;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class CreateListDemo {

	List<Integer> generateList(List<Integer> list) {

		list.add(100);
		list.add(220);
		list.add(350);
		list.add(450);
		list.add(590);

		return list;
	}
}

public class Test_list {

	 public static void main(String[] args) {
		
		 CreateListDemo cd = new CreateListDemo();
		 

			List<Integer> al = cd.generateList(new ArrayList<Integer>());
		    System.out.println(al.getClass().getName());
		    
		    List<Integer> ll= cd.generateList(new LinkedList<Integer>());
		    System.out.println(ll.getClass().getName());
		 
	}
	
}
