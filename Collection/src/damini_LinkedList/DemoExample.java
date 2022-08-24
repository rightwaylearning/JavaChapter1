package damini_LinkedList;


class Student{
	String name;
	int rollNumber;
	float Per;
	String std;
	public Student(String name, int rollNumber, float per, String std) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
		Per = per;
		this.std = std;
	}
	@Override
	public String toString() {
		return " ["+ name +","+ rollNumber+","+ Per +","+std + "]";
	}
	
}


public class DemoExample {

	public static void main(String[] args) {
		Student s1=new Student("Damini",25,60.57f,"5th");
		System.out.println(s1);
	}
}
