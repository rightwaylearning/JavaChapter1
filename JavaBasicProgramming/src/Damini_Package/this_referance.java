package Damini_Package;

public class this_referance {
	
	public static void main(String[] args) {
		example e =new example();
		e.a=20;
		e.b=40;
		
		//e.Show();
		e.ShowUp();
	
		
		
		//  ----------------------
		
		example e1= new example();
		 e1.initData(4, 2);
		 System.out.println(e1.a);
		 System.out.println(e1.b);
		 
		 
		 //---------------------
		 
		 System.out.println(">>>>>>>>>>>>>>>>");
		 example e2 =new example();
		 e2.init(3, 2);
		 System.out.println(e2.a);
		 System.out.println(e2.b);
	}
	

}
