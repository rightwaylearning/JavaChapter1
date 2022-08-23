package sahil_introofCollection;

public class Student {
	private String StudentName;
	private String StudentClass;
	private int StudentRollNumber;
    private double Studentpercentage;
    private int StudentPassingYear;
	
	public Student(String studentName, String studentClass, int studentRollNumber, double d,
			int studentPassingYear) {
		super();
		StudentName = studentName;
		StudentClass = studentClass;
		StudentRollNumber = studentRollNumber;
		Studentpercentage = d;
		StudentPassingYear = studentPassingYear;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public String getStudentClass() {
		return StudentClass;
	}

	public void setStudentClass(String studentClass) {
		StudentClass = studentClass;
	}

	public int getStudentRollNumber() {
		return StudentRollNumber;
	}

	public void setStudentRollNumber(int studentRollNumber) {
		StudentRollNumber = studentRollNumber;
	}

	public double getStudentpercentage() {
		return Studentpercentage;
	}

	public void setStudentpercentage(float studentpercentage) {
		Studentpercentage = studentpercentage;
	}

	public int getStudentPassingYear() {
		return StudentPassingYear;
	}

	public void setStudentPassingYear(int studentPassingYear) {
		StudentPassingYear = studentPassingYear;
	}
	
	
	
}
