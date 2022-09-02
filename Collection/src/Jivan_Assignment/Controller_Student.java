package Jivan_Assignment;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Controller_Student {
	
	public static void main(String[] args) {
		
		String [] input = {"Jivan", "Sahil","Akshay","Jivan", "Akshay", "Damini","Jivan","Sahil","Damini","Damini", "Poonam","Jivan","Damini", "Kalpesh","Sahil","Damini","Damini"};
		List<Student> storage = new ArrayList<>();
		
		for(String item : input) {
			
			boolean flag = checkNumberIsPresent(item, storage);
			
			if(flag == false) {
				Student obj = new Student(item, 1);
	            storage.add(obj);
			}

		}
		System.out.println(storage);
}
	
	private static boolean checkNumberIsPresent(String item, List<Student> storage) {
		// TODO Auto-generated method stub
		return false;
	}

	static boolean checkstudentnamePresent(String item, List<Student> storage) {
		
		ListIterator<Student> itr = storage.listIterator();
		
		while(itr.hasNext()) {
			Student obj = itr.next();
			if(item.equals(obj.getStudentCount())) {
				Integer count = obj.getStudentCount();
				count++;
				
				Student new1 = new Student(item, count);
				itr.set(new1);
				return true;
			}
		}
		return false;
	}

}
