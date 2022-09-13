package Poonam_Inheritance;

   interface parent{
	   void method1();
   } 
   
   interface child{
	   void method1();
   }
   
   class G implements parent,child{
	   
	   public void method1() {
		   System.out.println("I am from G...");
	   }
	   
	   }


  public class Multiple_Inheritance_Demo {

   public static void main(String[] args) {
	
	   G g = new G();
	   g.method1();
	   
	   child c = new G();
	   c.method1();
	   
	   parent p = new G();
	   p.method1();
	   
}
  
    }
