package Sonali_collection_All_Example;

import java.util.List;

public class Students {

	Integer RollNumber;
	String Name;
	List<String> Exams;

	public Students(Integer rollNumber, String name, List<String> exams) {
		super();
		this.RollNumber = rollNumber;
		this.Name = name;
		this.Exams = exams;
	}

	public Students() {

	}

	public Integer getRollNumber() {
		return RollNumber;
	}

	public void setRollNumber(Integer rollNumber) {
		RollNumber = rollNumber;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public List<String> getExams() {
		return Exams;
	}

	public void setExams(List<String> exams) {
		Exams = exams;
	}

	@Override
	public String toString() {
		return "[" + RollNumber + ", " + Name + ", " + Exams + "]";
	}

}