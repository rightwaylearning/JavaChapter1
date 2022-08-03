package Akshay_TypesOfVariable;

public class Product {
	
	String pack;
	int qty;
	
	static String name;
	
	void showDetils() {
		
		System.out.println("Pack Name is  = "+pack+" -------- (Used Instance Variable)");
		System.out.println("Total Qty is =  "+qty+" -------- (Used Instance Variable)");
		System.out.println("Company Name is =  "+name+" -------- (Used Static Variable)");
		System.out.println("=============================================================");
	}
}
