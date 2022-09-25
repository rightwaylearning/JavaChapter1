package Nilam_map_Example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class Student_Info {
	private String name;
	private Integer rollNumber;
	private List<String> exam;

	public Student_Info(String name, Integer rollNumber, List<String> exam) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
		this.exam = exam;
	}

	public Student_Info() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}

	public List<String> getExam() {
		return exam;
	}

	public void setExam(List<String> exam) {
		this.exam = exam;
	}

	@Override
	public String toString() {
		return " [" + name + ", " + rollNumber + ", " + exam + "]";
	}

}

public class Student_Details {
	// MH-CET, JEE, NEET, CAT
	public static void main(String[] args) {
		List<Student_Info> list = new ArrayList<>();
		List<String> Nilamexam = new ArrayList<>();
		Nilamexam.add("JEE");
		Nilamexam.add("NEET");
		Nilamexam.add("CAT");

		list.add(new Student_Info(" Nilam", 10, Nilamexam));

		List<String> Ajitexam = new ArrayList<>();
		Ajitexam.add("JEE");
		Ajitexam.add("MH-CET");
		
		list.add(new Student_Info(" Ajit", 10, Ajitexam));

		List<String> omkarexam = new ArrayList<>();
		omkarexam.add("JEE");
		omkarexam.add("NEET");
		omkarexam.add("CAT");
		omkarexam.add("MH-CET");
		
		list.add(new Student_Info(" omkar", 10, omkarexam));

		Map<String, List<String>> map = new HashMap<>();
		
		Iterator<Student_Info> itr = list.iterator();
		
		while(itr.hasNext()) {
			Student_Info obj = itr.next();
			
			List<String> exam = obj.getExam();
			//System.out.println(exam);
			
			Iterator<String> Inneritr = exam.iterator();
			while(Inneritr.hasNext()) {
				
				String exam1 = Inneritr.next();
				//System.out.println(exam1);
				if (map.containsKey(exam1)==false) {
					List<String> name= new ArrayList<>();
				name.add(obj.getName());
					map.put(exam1, name);
				}else {
					List<String> name = map.get(exam1);
					name.add(obj.getName());
					map.put(exam1, name);
				}
			}
			
		}
		System.out.println(map);

	}
}