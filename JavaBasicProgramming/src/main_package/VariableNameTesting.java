package main_package;

 class VariableNameTesting {

	 // allowed characters for identifies [a-z][A-Z][0-9][_,$]
	int accountNumber;
	String bankName;
	String ifscCode;
	String bank$Name;
	
	int student_Roll_Number;
	
	String s6576576766567;
	
	String fisrt$Name;
	
	String first_Name;
	
	String second_name;
	
	String last_Name;
	
	
	
	String student$Name = "Poonam";
	int sudentRollNumber= 23;
	
	void disp$value() {
		System.out.println(student$Name);
		System.out.println(sudentRollNumber);
	}
	
	public static void main(String[] args) {
		VariableNameTesting  v = new VariableNameTesting();
		v.disp$value();
		
	}
	
	
}
