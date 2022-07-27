package Akshay_New_Package;

public class Object_Array {

	public static void main(String[] args) {

		Car_Array[] c = new Car_Array[5];

		c[0] = new Car_Array();
		
		c[0].Carno = 001;
		c[0].CarName = "Swift";
		c[0].CalColour = "White";
		c[0].module = 2018;

		c[1] = new Car_Array();

		c[1].Carno = 002;
		c[1].CarName = "Innova";
		c[1].CalColour = "Gray";
		c[1].module = 2015;

		c[2] = new Car_Array();

		c[2].Carno = 003;
		c[2].CarName = "Scorpio";
		c[2].CalColour = "Black";
		c[2].module = 2011;

		c[3] = new Car_Array();

		c[3].Carno = 004;
		c[3].CarName = "Maruti I-20";
		c[3].CalColour = "Pink";
		c[3].module = 2014;

		c[4] = new Car_Array();

		c[4].Carno = 005;
		c[4].CarName = "Breeza";
		c[4].CalColour = "Cream";
		c[4].module = 2016;
		
//		c[5] = new Car_Array();
//
//		c[5].Carno = 006;
//		c[5].CarName = "Creta";
//		c[5].CalColour = "Yellow";
//		c[5].module = 2019;

		System.out.println("Details of the Car");
		c[0].showDetails();
		c[1].showDetails();
		c[2].showDetails();
		c[3].showDetails();
		c[4].showDetails();
		System.out.println("----------------------------------");

	}

}
