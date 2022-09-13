package Poonam_Inheritance;


     interface A1{
    	 void m1();
     }
     
     interface A2{
    	 void m1();
     }
     
     interface G1 extends A1,A2{
    	 
     }
     

public class Interface_Extends_Interface implements G1 {

     public void m1() {
    	 System.out.println("I am main class method....");
    	 
    	 	  }	
     
     public static void main(String[] args) {
		
    	 A1 a = new Interface_Extends_Interface();
    	 a.m1();
    	 
    	 A2 aa = new Interface_Extends_Interface();
    	 aa.m1();
    	 
    	 G1 g = new Interface_Extends_Interface();
    	 g.m1();
    	 
	}
	
}
