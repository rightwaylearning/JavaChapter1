package ProgramsOnNumbers;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 35;
		boolean flag = true;
		int div = 2;
		
		while(div < num) {
		 
			if(num % div == 0) {
		    	flag = false;
		    	break;
		    }	
			
			div++;
		}
		
		if(flag) {
			System.out.println("I am prime number");
		}else {
			System.out.println("given Number is not prime");
		}
		
	}
}
