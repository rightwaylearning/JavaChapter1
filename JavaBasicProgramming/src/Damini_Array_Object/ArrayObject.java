package Damini_Array_Object;

public class ArrayObject {

	public static void main(String[] args) {
		
		Arraystudent[] ar=new Arraystudent[5];
		
		
	// way 1 to assign array	
		ar[0]=new Arraystudent();
		    ar[0].name="ss";
		    ar[0].rollNumber=25;
		    
  //>>>>>>>>>>>>>>>>>>>>>
   
   // way 2 to assign array
		  
		    Arraystudent a=new Arraystudent();
		    a.name="dd";
		    a.rollNumber=35;
		    
		    Arraystudent s=new Arraystudent();
		    s.show(ar);
		   
		   
		   
		//   System.out.println(a.name);
		    
		   
	}
}
