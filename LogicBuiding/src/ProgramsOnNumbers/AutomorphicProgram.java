package ProgramsOnNumbers;

public class AutomorphicProgram {
 
	/*
       Automorphic Number Program in Java
        An Automorphic number is a number whose square “ends” in the same digits as the number itself. Examples: 5*5 = 25, 6*6 = 36, 25*25 = 625

    */
	
	public static void main(String[] args) {
		int num = 12;
		int squre =  num*num; // 625
		
		int inputlength = digitCount(num);
		int result = returnLastFewDigit(squre, inputlength);
		
		if(num == result) {
			System.out.println("I am Automorphic Number");
		}else {
			System.out.println("sorry");
		}
		
	}
	
	
	
	
	static int returnLastFewDigit(int n, int digitLeng) {
		String r ="";
		int cnt =0;
		
		while(n>0) {
			int rem = n%10;
			r = rem + r;
			n = n/10;
			cnt++;
			if(cnt == digitLeng) {
			  break;
			}
		}
		
		int result = Integer.parseInt(r);
		return result;
	}
	
	static int digitCount(int n) {
	    int len = 0;
	    while(n > 0) {
	    	len ++;
	    	n = n/10;
	    }
		return len;
	}
}
