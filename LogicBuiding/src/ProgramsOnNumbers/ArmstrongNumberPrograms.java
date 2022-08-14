package ProgramsOnNumbers;

public class ArmstrongNumberPrograms {

	public static void main(String[] args) {

		int input = 1;

		while (input <= 1000) {

			int num = input;
			int copyOfNum = num;
			int sum = 0;
			
			while(num > 0) {
				int r = num % 10;
				sum = sum + (r*r*r);
				num =num/10;
			}
			
			if(sum == copyOfNum) {
				System.out.println(copyOfNum+ " is Armstron Number");
			}
			
			input++;
		}

	}
}
