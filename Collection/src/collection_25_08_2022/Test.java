package collection_25_08_2022;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class CreateList {

	List<Integer> generateList(List<Integer> list) {

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		return list;
	}
}

public class Test {

	public static void main(String[] args) {

		CreateList list = new CreateList();
		
		List<Integer> al = list.generateList(new ArrayList<Integer>());
	    System.out.println(al.getClass().getName());	
		
		List<Integer> ll= list.generateList(new LinkedList<Integer>());
	    System.out.println(ll.getClass().getName());
	}

}
