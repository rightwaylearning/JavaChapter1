package Sahil_array.typeOFvariablesSahil;



public class test {
	public static void main(String[] args) {
		college.collegeName = "Right way Learning";
        college.barnchName= "java";
        
		college sahil = new college ();
		sahil.name = "sahil";
		sahil.rollNumber = 254;
		sahil.contactNmeber=8407920439L;
		
		college akshy = new college();
		akshy.name = "akshy";
		akshy.rollNumber =  545;
		akshy.contactNmeber= 8754225544L;
		
		college suraj =new college();
		suraj.name = "suraj";
		suraj.rollNumber = 655;
		suraj.contactNmeber = 55461494164L;
	
			
      sahil.ShowData();
      akshy.ShowData();
      suraj.ShowData();
		
		
         
	
	
		System.out.println(college.collegeName);
       System.out.println(sahil.name);
		System.out.println(sahil.rollNumber);
		System.out.println(college.barnchName);
		System.out.println(sahil.contactNmeber);
		System.out.println("===================");
		
		System.out.println(college.collegeName);
		System.out.println(akshy.name);
		System.out.println(akshy.rollNumber);
		System.out.println(college.barnchName);
		System.out.println(akshy.contactNmeber);
		System.out.println("======================");
		System.out.println(college.collegeName);
		System.out.println(suraj.name);
		System.out.println(suraj.rollNumber);
		System.out.println(college.barnchName);
		System.out.println(suraj.contactNmeber);
		System.out.println("===================");
	}
}
