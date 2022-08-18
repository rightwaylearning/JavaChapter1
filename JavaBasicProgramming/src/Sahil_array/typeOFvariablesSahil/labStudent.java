package Sahil_array.typeOFvariablesSahil;

public class labStudent {
	
   static String labName;
   static int year;
   
   String studentName;
   String className;
   long contrctNumber;
   
    void show () {
    	System.out.println("type of veribles");
    	System.out.println(labStudent.labName);
    	System.out.println(labStudent.year);
    	
    	System.out.println(this.studentName);
    	System.out.println(this.className);
    	System.out.println(this.contrctNumber);
    	System.out.println("============================");
    }
	void showData () {
		System.out.println("using for tytp of viriables arry");
		System.out.println(labStudent.labName);
		System.out.println(labStudent.year);
		System.out.println(this.studentName);
		System.out.println(this.className);
	    System.out.println(this.contrctNumber);
	    System.out.println("******************************");
	}
	
}
