package Reference_Variables_Jivan;

public class Student {
	
	String name;
	int rollNumber;
	
	public Student(String name, int rollNumber) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
		
	}
	
	@Override
	public String toString() {
		//return "Student [name=" + name + ", rollNumber=" + rollNumber + "]";
		return "[" + name + " , " + rollNumber + "]";
	}
	

	public static void main(String[] args) {
		Student s = new Student("Vinay", 23);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println(s);
		//System.out.println(s.toString());
		//String str = s.toString();
		//System.out.println(str);
	}
}
