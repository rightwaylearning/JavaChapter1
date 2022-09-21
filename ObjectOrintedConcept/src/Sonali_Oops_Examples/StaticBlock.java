package Sonali_Oops_Examples;

class StaticBlockExample{
	static {
		System.out.println("I am first static block");
		
	}
	 StaticBlockExample(){
		 System.out.println("I am constructor");
	 }
	 static {
		 System.out.println("I am 2nd static block");
	 }
	 {
		 System.out.println("I am instance block");
	 }
}
public class StaticBlock {
	public static void main(String[] args) {
		StaticBlockExample s = new StaticBlockExample();
		System.out.println("I am Main Method");
	}
	

}
