package Sahil_array;

public class detalisObject {
	
	public static void main(String[] args) {
		
		bikeDetails [] b = new bikeDetails [5];
		
		         b[0]= new bikeDetails();
		               b[0].No = 1;
		               b[0].bikeName = "Activa";
		               b[0].colour = "black";
		               b[0].year = 2015;
		               b[0].sellingprice = 35000;
		               
		         b[1]= new bikeDetails();
		               b[1].No = 2;
		               b[1].bikeName = "maestro";
		               b[1].colour = "white";
		               b[1].year = 2018;
		               b[1].sellingprice = 45000;
		               
		         b[2]= new bikeDetails();
		               b[2].No = 3;
		               b[2].bikeName = "pulsar";
		               b[2].colour = "black";
		               b[2].year = 2018;
		               b[2].sellingprice = 65000;
		               
		         b[3]= new bikeDetails();
		               b[3].No = 4;
		               b[3].bikeName = "passion";
		               b[3].colour = "black";
		               b[3].year = 2019;
		               b[3].sellingprice = 70000;
		               
		         b[4]= new bikeDetails();
		               b[4].No = 5;
		               b[4].bikeName = "KYM";
		               b[4].colour = "white";
		               b[4].year = 2020;
		               b[4].sellingprice = 120000;
		               
		               
		              b[0].showditels();
		              b[1].showditels();
		              b[2].showditels();
		              b[3].showditels();
		              b[4].showditels();
		            		   

	}

}
