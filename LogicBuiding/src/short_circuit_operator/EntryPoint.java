package short_circuit_operator;

public class EntryPoint {

	public static void main(String[] args) {
		ValidateCardidateForFinalRound obj;
		obj= new ValidateCardidateForFinalRound();
		
		if(obj.screeningRound() && obj.levvelOne()) {
		   System.out.println("HR please schedule 2nd round");
		}else {
     		System.out.println("HR please try again");
		}
		
		int x = 10;  int y = 20;
		if(x++ > 11 || ++y> 20) {
			x++;
		}else {
			y++;
		}	
		System.out.println(x); // 12, 
		System.out.println(y); // 21
		
		
		 x = 10;   y = 20;
		if(x++ > 11 && y++> 20) {
			x++;
		}else {
			y++;
		}	
		System.out.println(x); // 11
		System.out.println(y); // 21
		
		
		     x = 10;   y = 20;
			if(x++ > 11 || y++> 20) {
				x++;
			}else {
				y++;
			}	
			System.out.println(x); // 11
			System.out.println(y); // 22
			
			// for loop 
			// while 
			// number 
			// start pattren 
	}
}
