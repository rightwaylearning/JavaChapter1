
public class ArrayOfObjectDelivery {

	public static void main(String[] args) {
		
		Student[] arr = new Student[100];  // 0 to 3
		
		arr[0] = new Student();
		arr[0].name = "AB";
		arr[0].rollNumber = 23;
	// ---------------------------------------------------
		Student s = new Student();
		  s.name = "LM";
		  s.rollNumber = 35;
				  
		arr[1] = s;	
  // ------------------------------------------------------
		arr[2] = new Student();
		arr[2].name = "LM";
		arr[2].rollNumber = 34;
	// ---------------------------------------------------
		
		arr[3] = new Student();
		arr[3].name ="OPQ";
		arr[3].rollNumber = 45;
	//----------------------------------------------------
		 
		
		ViewStudentData view = new ViewStudentData();
		view.showData(arr);
		
		
	}
}
