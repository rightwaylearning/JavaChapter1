package ProgramsOnNumbers;

public class PerfectNumber {

	public static void main(String[] args) {
		
		int num = 21;
		int div = 1;
		int sum = 0;
		
		while(div < num) {
			
			if(num % div == 0) {
				sum = sum + div;
			}
			
			div++;
		}
		
		if(num == sum) {
			System.out.println("Perfect Number");
		}else {
			System.out.println("Sorry");
		}
				
	}
}
