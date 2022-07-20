package nilam_package;

public class Controller {

  public static void main (String[] arg) {
	   
	  Demo d = new Demo();  
	  
	  int r= d.dosum(10,30);
	  System.out.println(r);
	   
	  float r1 = d.div(30.3F, 20.0F);
	  System.out.println(r1);
	  
	  Employee r2 =d.object();
	  System.out.println(r2.EmployeeName);
	  System.out.println(r2.Employeeid);
	  
	  
  }


}
