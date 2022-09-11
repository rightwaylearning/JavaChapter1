package Sonali_collection_All_Example;

public class StudentInfo implements Comparable<StudentInfo> {
	private String sname;
	private Integer RollNO;

	public StudentInfo(String sname, Integer rollNO) {
		super();
		this.sname = sname;
		RollNO = rollNO;
	}

	StudentInfo() {

	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Integer getRollNO() {
		return RollNO;
	}

	public void setRollNO(Integer rollNO) {
		RollNO = rollNO;
	}

	@Override
	public String toString() {
		return " [" + sname + ", " + RollNO + "]";
	}

	@Override
	public boolean equals(Object obj) {
		StudentInfo s = (StudentInfo) obj;
		if (this.RollNO.equals(s.RollNO) && (this.sname.equals(s.sname))) {
			return true;
		}
		return false;

	}

	@Override
	public int hashCode() {
		return this.RollNO.hashCode() + this.sname.hashCode();

	}

	@Override
	public int compareTo(StudentInfo o) {
		StudentInfo s = (StudentInfo) o;
		// return this.RollNO.compareTo(o.RollNO);
		/*
		 * if(this.RollNO < s.RollNO) { return 1;
		 * 
		 * }else { if(this.RollNO > s.RollNO) { return -1; } return 0; }
		 */
		return -this.RollNO < s.RollNO ? -1 : this.RollNO > s.RollNO ? 1 : 0;
	}

}
