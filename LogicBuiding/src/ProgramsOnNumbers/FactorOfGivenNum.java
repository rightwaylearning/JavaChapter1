package ProgramsOnNumbers;

public class FactorOfGivenNum {

	public static void main(String[] args) {
		int num = 18;
		int start = 1;
		
		while(start < num) {
		
			if(num % start == 0) {
				System.out.print(start +" ");
			}
			start++;
		}
	}
}
