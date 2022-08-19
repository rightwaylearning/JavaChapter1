package NilamCollection;

import java.util.ArrayList;

public class ArrayvsCollection {
	public static void main(String[] args) {
		Student[]s= new Student[5];
		s[0]=new Student();
		s[1]= new Student();
		s[2]= new Student();
		//s[3]=new Employee(); //C.E Employee cannot be resolved 
		
		ArrayList al = new ArrayList();
		al.add(new Student());
		al.add(new Employee());
		al.add(new Student());
		
	}

}
