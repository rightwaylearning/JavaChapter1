package Nilam_reference_variable;

public class Child extends Parent{

		int a =10;
		int b =20;



     void showproperty() {
    	 System.out.println(this.a);
    	 System.out.println(this.b);
    	 System.out.println(super.a);
    	 System.out.println(super.b);
    	 
     }
}