package EqualMethod;

public class Student {
	String Name;
	Integer RollNo;

	public Student(String name, Integer rollNo) {
		super();
		this.Name = name;
		this.RollNo = rollNo;
	}
	

	
	


	public static void main(String[] args) {
		Student s = new Student("sonal" , 10);
		Student s1 = new Student("ab", 101);
		Student s2 = new Student("takali", 110);
		Student s3 = new Student("sonal", 10);
		Student s4 = s2;
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		System.out.println(s.equals(s3));
		System.out.println(s.equals(s4));
		System.out.println(s4.equals(s2));

	}

}
