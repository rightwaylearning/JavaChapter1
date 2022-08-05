package Sahil_array.typeOFvariablesSahil;

public class car_variables {
	
     static String companyName;
     String carName;
     short modelYear;
     int sellingPrice;
     String colour;
     
     static void  showData() {
    	  System.out.println("******************************************");
    	  System.out.println(car_variables.companyName); 
 		  car_variables showData =new  car_variables();

    
		  System.out.println(showData.carName);
		  System.out.println(showData.modelYear);
		  System.out.println(showData.colour);
		  System.out.println(showData.sellingPrice);
	}
     
      void  showDitels() {
   	  System.out.println("******************************************");
   	  
   	     System.out.println(car_variables.companyName); 
		  System.out.println(this.carName);
		  System.out.println(this.colour);
		  System.out.println(this.sellingPrice);
		  System.out.println(this.modelYear);
	}

}
