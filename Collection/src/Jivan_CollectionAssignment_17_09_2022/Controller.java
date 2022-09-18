package Jivan_CollectionAssignment_17_09_2022;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class Controller {

	private static final int MHT = 0;
	private static final int CET = 0;

	public static void main(String[] args) {
		HashMap<Integer, StudentsAttendingExams> map = new HashMap <> ();
		
		map.put(1, new StudentsAttendingExams("Darshan", 123291, "MHT-CET"));
		map.put(2, new StudentsAttendingExams("Sahil", 123292, "JEE"));
		map.put(3, new StudentsAttendingExams("Ganesh", 123293, "MSCIT"));
		map.put(4, new StudentsAttendingExams("Suhas", 123294, "NEET"));
		map.put(5, new StudentsAttendingExams("Jivan", 123295, "MHT-CET"));
		map.put(6, new StudentsAttendingExams("Vaibhav", 123296, "MHT-CET"));
		map.put(7, new StudentsAttendingExams("Akshay", 123297, "MPSC"));
		map.put(8, new StudentsAttendingExams("Nishant", 123298, "UPSC"));
		map.put(9, new StudentsAttendingExams("Omkar", 123299, "SSC"));
		map.put(10, new StudentsAttendingExams("Kunal", 123300, "HSC"));
		
Set<Entry<Integer, StudentsAttendingExams>> s = map.entrySet();
Iterator<Entry<Integer, StudentsAttendingExams>> itr = s.iterator();

		while(itr.hasNext()) {
			Entry<Integer, StudentsAttendingExams> key = itr.next();
			System.out.println(key);
	}
		int i = 0;
		for (Entry<Integer, StudentsAttendingExams> l:s) {
			if(map.containsKey(l)==false)
			{
				map.put(123291, null);
			}
			else
			{
				StudentsAttendingExams d=map.get(l);
				i++;
				map.put((int) i, null);
			}
	}
}
}