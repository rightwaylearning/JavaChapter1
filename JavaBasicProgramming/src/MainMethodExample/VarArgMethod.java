package MainMethodExample;

public class VarArgMethod {

	void sum(int... num) {  //  
       
		int sum =0;
		
		for(int a:num) {
			sum = sum + a;  
		}
				
		//System.out.println(sum);
		System.out.println("i am var arg method");
	}
	
	void sum(int a, int b) {
		System.out.println("I have 2 parameter");
	}
}
