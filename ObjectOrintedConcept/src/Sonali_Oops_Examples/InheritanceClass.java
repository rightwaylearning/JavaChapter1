package Sonali_Oops_Examples;


	
	class p{
		public void m1() {
			System.out.println("I am parent method");
		}
		class c extends p{
			public void m1()
			{
				}
			}
	}
	public class InheritanceClass {
		
	public static void main(String[] args) {
		
		p p1 = new p();
		p1.m1();
		
	}

}
