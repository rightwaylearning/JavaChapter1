package sahil_arrayLogicalprogram;

public class employe {
	String fastName;
	String lastName;
	String fullNmae;
	double Pyment;
	
	public employe(String fastName, String lastName, String fullNmae, double pyment) {
		super();
		this.fastName = fastName;
		this.lastName = lastName;
		this.fullNmae = fullNmae;
		Pyment = pyment;
	}

	public String getFastName() {
		return fastName;
	}

	public void setFastName(String fastName) {
		this.fastName = fastName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFullNmae() {
		return fullNmae;
	}

	public void setFullNmae(String fullNmae) {
		this.fullNmae = fullNmae;
	}

	public double getPyment() {
		return Pyment;
	}

	public void setPyment(double pyment) {
		Pyment = pyment;
	}

	@Override
	public String toString() {
		return "employe [fastName=" + fastName + ", lastName=" + lastName + ", fullNmae=" + fullNmae + ", Pyment="
				+ Pyment + "]";
	}
	
	

	
	

}
