package Damini;

public class ShortCircuitController {
	public static void main(String[] args) {
		
		shortCircuitOperatoer cir =new shortCircuitOperatoer();
		 boolean r=cir.m1() && cir.m2();
		 
		 System.out.println(r);
		  
		 int x=10;
		 int y=20;
		 
		 boolean o1=(++x > 10) &&(++y > 20);
		 System.out.println(o1);	//true
		 System.out.println(x);//11
		 System.out.println(y);//21
		 
		 System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");
		 
		 boolean o2=(++x> 11) && (++y >20);
		 System.out.println(o2);
		 System.out.println(x);
		 System.out.println(y);
		 
		 boolean o3=(x++>15) && (y++ >20);
		 System.out.println(o3);
		 System.out.println(x);
		 System.out.println(y);
		 
	}
	

}
