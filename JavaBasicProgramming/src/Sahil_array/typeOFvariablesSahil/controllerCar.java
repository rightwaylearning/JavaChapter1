package Sahil_array.typeOFvariablesSahil;

public class controllerCar {
	public static void main(String[] args) {
		 car_variables.companyName = "HONDA";
		 
		 car_variables c = new  car_variables();
		 c.carName="i20 sport";
		 c.modelYear= 2020;
		 c.colour="white";
		 c.sellingPrice= 500000;
		 
		 car_variables c1 =new  car_variables();
		 c1.carName="swift dzire";
		 c1.modelYear= 2019;
		 c1.colour="red";
		 c1.sellingPrice= 550000;
		 
		 car_variables c2 =new  car_variables();

		 c2.carName="swift";
		 c2.modelYear= 2017;
		 c2.colour="white";
		 c2.sellingPrice= 450000;
		 
		 car_variables c3 =new  car_variables();
		 c3.carName="i10 sport";
		 c3.modelYear= 2016;
		 c3.colour="balck";
		 c3.sellingPrice= 350000;
		 
		 car_variables c4 =new  car_variables();
		 c4.carName="hona cite";
		 c4.modelYear= 2021;
		 c4.colour="balck";
		 c4.sellingPrice= 950000;
		 
		 car_variables c5 =new  car_variables();
		 c5.carName="berzza";
		 c5.modelYear= 2019;
		 c5.colour="white";
		 c5.sellingPrice= 850000;
		 
		 car_variables sahil [] = new  car_variables[6];
		 
	     sahil [0] = new  car_variables();
		 sahil[0].carName = "i20 sport";
		 sahil[0].modelYear = 2020;
		 sahil[0].colour="white";
		 sahil[0].sellingPrice = 500000;
				 
	     sahil [1] = new  car_variables();
		 sahil[1].carName = "honda city";
		 sahil[1].modelYear = 2020;
		 sahil[1].colour="white";
		 sahil[1].sellingPrice = 700000;

				 
	     sahil [2] = new  car_variables();
		 sahil[2].carName = "swift";
		 sahil[2].modelYear = 2016;
		 sahil[2].colour="white";
		 sahil[2].sellingPrice = 200000;
		 
	     sahil [3] = new  car_variables();
		 sahil[3].carName = "i20 sport";
		 sahil[3].modelYear = 2020;
		 sahil[3].colour="white";
		 sahil[3].sellingPrice = 500000;

	     sahil [4] = new  car_variables();
		 sahil[4].carName = " sport";
		 sahil[4].modelYear = 2019;
		 sahil[4].colour="white";
		 sahil[4].sellingPrice = 800000;

	     sahil [5] = new  car_variables();
		 sahil[5].carName = "i20 ";
		 sahil[5].modelYear = 2013;
		 sahil[5].colour="white";
		 sahil[5].sellingPrice = 380000;

	     for (int i=0; i<6; i++)
	    	 sahil[i].showDitels();

		
		 
		 c.showData();
		 c1.showData();
		 c2.showData();
		 c3.showData();
		 c4.showData();
		 c5.showData();




	}

}
