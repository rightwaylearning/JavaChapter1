package test;

 class P{
	int x;
	int y;
	
	P(int x, int y){
		this.x =x;
		this.y =y;
	}
	P(){
		System.out.println("I am parent ZERO");
	}	
 }
 
 class C extends P{
     int a;
     int b;
	 C(int x, int y, int a, int b){
		 super(x,y);
		 this.a = a;
		 this.b = b;
	}
	 
	 C(){
		 super(1,2);
		 System.out.println("I am Child ZERO");
		 System.out.println(x);
		 System.out.println(y);
	 }
 }


public class ParametrizeConstructor {

	public static void main(String[] args) {
		//C c= new C(10,20,30,40);
		
		C c1= new C(10,10,90,90);
	}
}
