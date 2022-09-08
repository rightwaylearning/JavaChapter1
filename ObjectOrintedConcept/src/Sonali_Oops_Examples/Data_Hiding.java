package Sonali_Oops_Examples;



class Student {
	String Stdname;
	Integer StdId;

	public Student(String stdname, Integer stdId) {
		super();
		Stdname = stdname;
		StdId = stdId;
	}

	Student() {
	}

	public String getStdname() {
		return Stdname;
	}

	public void setStdname(String stdname) {
		Stdname = stdname;
	}

	public Integer getStdId() {
		return StdId;
	}

	public void setStdId(Integer stdId) {
		StdId = stdId;
	}

	@Override
	public String toString() {
		return "Student [Stdname=" + Stdname + ", StdId=" + StdId + "]";
	}

}

	
public class Data_Hiding {

	public static void main(String[] args) {
		Student s = new Student();
		s.setStdId(1);
		s.setStdname("sonali");
		System.out.println(s);
		Student s1 = new Student();
		s1.setStdId(2);
		s1.setStdname("Sona");
		System.out.println(s1);

	}

}


