package Sahil_array.typeOFvariablesSahil;

public class labController {
	public static void main(String[] args) {
		
		
		labStudent.labName = "jotiba lab";
		labStudent.year= 2008;
		
		labStudent t = new labStudent ();
		t.studentName = "Nikhel";
		t.className = "B.A";
		t.contrctNumber=84958692552L;
		
		labStudent t1 = new labStudent ();
        t1.studentName ="suraj";
        t1.className = "ITI or B.A final year";
        t1.contrctNumber =	5874525455255L;
        
		labStudent t2 = new labStudent ();
		t2.studentName ="pritam";
		t2.className ="B.E ELECTRICAL ENNG";
		t2.contrctNumber = 5424842454555L;
		
		labStudent info[] = new labStudent[5]; 
		
		info [0]=  new labStudent ();
		info[0].studentName = "sahil";
		info[0].className = "eletrical enng";
		info[0].contrctNumber= 5847865659566L;
		
		info [4]=  new labStudent ();

		info [4].studentName = "parvin";
		info [4].className= "B.E";
		info [4].contrctNumber = 554851898844465L;

		   
		    	 info[0].showData();
		    	 info[4].showData();
		
		t.show();
		t1.show();
		t2.show();
	}

}
