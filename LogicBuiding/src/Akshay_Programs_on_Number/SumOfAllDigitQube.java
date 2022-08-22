package Akshay_Programs_on_Number;

public class SumOfAllDigitQube {

	public static void main(String[] args) {

		int a = 23456;
		int copya = a;
		int sum = 0;

		while (a > 0) {

			int r = a % 10;
			sum = sum + (r * r * r);
			a = a / 10;
		}
		System.out.println("Given number is =  "+copya+" & sum of qube is =  "+sum);
	}

}

// Here doubt on answer of cube. 
// 23456 = sum of digit is 20 so cube of 20 is 8000 but java shows the answer 440.