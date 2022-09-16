package Sonali_collection_All_Example;

public class StudentData {
	String Name;
	Integer RollNo;
	public StudentData(String name, Integer rollNo) {
		super();
		Name = name;
		RollNo = rollNo;
	}
	
	StudentData(){
		
	}
	

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Integer getRollNo() {
		return RollNo;
	}

	public void setRollNo(Integer rollNo) {
		RollNo = rollNo;
	}

	@Override
	public String toString() {
		return "(" + Name + ", " + RollNo + ")";
	}
	 
	               
}
