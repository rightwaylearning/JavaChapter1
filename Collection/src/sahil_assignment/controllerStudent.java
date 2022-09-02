package sahil_assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class controllerStudent {

public static void main(String[] args) {
	String [] input = {"sahil", "akshya","poonam","damini","jivan","sahil","damini","jivan","kalpesh",};
	List<Student> storage = new ArrayList<>();
	
	for(String item:input) {
		
		boolean flag = checstudentnamePresent(item,storage);
		
		if(flag == false) {
			Student obj =new Student(item,1);
			storage.add(obj);
		}
	}
	System.out.println(storage);
	
}

static  boolean checstudentnamePresent(String item,List<Student> storage) {
	
	ListIterator<Student> itr = storage.listIterator();	
	while(itr.hasNext()) {
		Student obj = itr.next();
		if(item.equals(obj.getStudentName())) {
			Integer count = obj.getStudentcount();
	          count++;
			     
			Student new1= new Student(item,count);
			itr.set(new1);
			return true;
		}
	}
	
	return false;



}
}
