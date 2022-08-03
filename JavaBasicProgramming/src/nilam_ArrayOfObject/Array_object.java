package nilam_ArrayOfObject;

public class Array_object {
	 
	public static void main(String[]arg) {
	Student[] s = new Student[4]; 
	
	          s[0]= new Student();
	          s[0].name="AB";
	          s[0].rollNumber=1;
	          
	          s[1]= new Student(); 
	          s[1].name="Ac";
	          s[1].rollNumber=2;
	          
	          s[2]= new Student();
	          s[2].name="Ad";
	          s[2].rollNumber=3;
	          
	          s[3]= new Student();
	          s[3].name="Af";
	          s[3].rollNumber=4;
	          
	          ViewStudentdata V = new ViewStudentdata();
	          V. showdata(s);
	        
	 
	
	}
}
