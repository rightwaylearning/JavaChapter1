package ProgramsOnNumbers;

public class ArmstrongNumberPrograms {

	public static void main(String[] args) {
		
		int num = 153;
		int copyOfNum = num;
		int sum = 0;
		
		while(num > 0) {
			int r = num % 10;
			sum = sum + (r*r*r);
			num =num/10;
		}
		
		if(sum == copyOfNum) {
			System.out.println("ArmstronNumber");
		}else {
			System.out.println("Sorry");
		}
	}
}
