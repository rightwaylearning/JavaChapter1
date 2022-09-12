package Sahil_LinkListarray;

import java.util.Iterator;
import java.util.LinkedList;

import sahil_introofCollection.Student;

public class controller2 {
public static void main(String[] args) {
	LinkedList<student>d = new LinkedList<student>();
	
	student d1 = new student("partiksh", "java", 60.20, 2022);
	d.add(d1);
	student d2 = new student("poonam", "java", 90.50, 2022);
	d.add(d2);
	student d3 = new student("lutika", "java", 80, 2022);
	d.add(d3);
	student d4 = new  student("parnjali","java", 56.25, 2022);
	d.add(d4);
	Iterator<student> itr = d.iterator();
System.out.println(itr);
}
}
