package main_array_examples;

public class ArrayOfObject {
	public static void main(String[] args) {

		Student[] arr = new Student[5];

		// way 1 to assign value to array
		arr[0] = new Student();
						arr[0].name = "AB";
						arr[0].rollNumber = 123;
						
   // ----------------------------------						
		// way 2 to assign value to array		
				Student s = new Student();
					s.name = "WW";
					s.rollNumber = 23;
				
	         arr[0] = s;
		

	}
}
