package sahil_collection;



public class arrayController {
public static void main(String[] args) {
	arrayEmployee[] a = new arrayEmployee [4];
	
   a[0]= new arrayEmployee ();
   a[0].Name = "sahil";
   a[0].ID = 101;
   a[0].salary = 15000.00;
   
   a[1]= new arrayEmployee ();
   a[1].Name = "damini";
   a[1].ID =102;
   a[1].salary = 35000.00;
 
   a[2]= new arrayEmployee ();
   a[2].Name = "poonam";
   a[2].ID= 103;
   a[2].salary = 18000;
   
   a[3]= new arrayEmployee ();
   a[3].Name = "akshay";
   a[3].ID = 104;
   a[3].salary = 45000;
   
    
    
    for (int i=0; i<4; i++)
  	 a[i].sahil();
    
    
}   
}   	
    



	



	
	



