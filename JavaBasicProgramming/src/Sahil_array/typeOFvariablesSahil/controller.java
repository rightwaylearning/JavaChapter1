package Sahil_array.typeOFvariablesSahil;



public class controller {
	public static void main(String[] args) {
		
		//this is static variable//
		bank.bankName = "*BANK OF BORODA*";
		bank.barnchName = "nandavan"; 
		
		//this is object  it us type of object for us//
	bank t= new bank();
	t.name = "sahil";
	t.AccountNumber =1516549599851651L;
	t.address = "nagpur 440009";
	
    bank t1 = new bank();
    t1.name ="akshay";
	t1.AccountNumber = 21516516511654L;
    t1.address = "nashik 422008";
    
     bank t2 = new bank ();
     t2.name = "kalpna";
     t2.AccountNumber = 2155261455548L;
     t2.address = "mumbai 400008";
     
     bank t3 = new bank();
     t3.name = "suraj";
     t3.AccountNumber = 586977777855L;
     t3.address = "pune 488882";
     
     // i am use for array than us full//
     // it is array size 5 and denoted for 0 to 4 //
     bank sahil[]= new bank [5];
     sahil[0]=new bank();
     sahil[0].name="sahil";
     sahil[0].AccountNumber= 245647484646899L;
     sahil[0].address= "nagpur 440009";
     
     sahil[1]=new bank();
     sahil[1].name= "akshay";
     sahil[1].AccountNumber=25478888888888L;
     sahil[1].address= "nashik422004";
     
     sahil[2]=new bank ();
     sahil[2].name="kalpna";
     sahil[2].AccountNumber=78165489499254L;
     sahil[2].address= "mumbai400002";
    		 
    sahil[3]= new bank();		 
     sahil[3].name="suraj";
     sahil[3].AccountNumber=5554448887777L;
     sahil[3].address="nagpur 440008";
     
     sahil [4]= new bank();
     sahil[4].name= "pallavi";
     sahil[4].AccountNumber=54446165498426548L;
     sahil[4].address= "bhandra 40025";
     
     System.out.println("//////array method ues/////// ");

     for (int i=0; i<5; i++)
    	 sahil[i].showData();
     
		System.out.println("=========type of variables use for static void method=========");

     t.showDitels();
     t1.showDitels();
     t2.showDitels();
     t3.showDitels();
     
		System.out.println("=========type of variables use for  void method=========");

     t.show();
     t1.show();
     t2.show();
     t3.show();
	
		
	}
}
