package constuctor;

public class EntryPoint {

	public static void main(String[] args) {
		
		Student s = new Student("AB", 23, "10th", 'A');
		s.studentName = "LMN";
		System.out.println(s.studentName);
		
		s.setStudentName("ABC");
		
		System.out.println(s.studentName);
		
			
		
		Student s1=new Student();
			s1.setStudentName("lmn");
			s1.setRollNumber(23);
			s1.setStd("12th");
			s1.setDivision('B');
		
	}
}
