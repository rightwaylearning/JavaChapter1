package Nilam;

public class ArmstrongNumberProgram {
	public static void main(String[] args) {

		int num = 153;
		int sum = 0;
		int copynum = num;

		while (num > 0) {
			int r = num % 10;
			sum = sum + (r * r * r);
			num = num / 10;

		}
		if (sum == copynum) {
			System.out.println("armstrong number");

		}else {

		System.out.println("not armstrong number");}
	}

}
