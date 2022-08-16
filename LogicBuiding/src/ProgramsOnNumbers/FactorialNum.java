package ProgramsOnNumbers;

public class FactorialNum {

	public static void main(String[] args) {
		
		int num = 5; 
		int fact = 1;
		while(num > 0) {
		  fact = fact * num;
		  num--;
		}
		
		System.out.println(fact);
	}
}
