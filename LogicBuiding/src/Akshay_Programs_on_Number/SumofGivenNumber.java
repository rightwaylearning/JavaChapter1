package Akshay_Programs_on_Number;

public class SumofGivenNumber {

	public static void main(String[] args) {

		// Example 1

		int a = 1234;
		int copy1 = a;
		int sum = 0;

		while (a > 0) {

			int r = a % 10; // Answer is 4 + 3 + 2 + 1 (because while loop is > 0)
			sum = sum + r; // Answer is 10
			a = a / 10; // Answer is 123
		}

		System.out.println("Given number is " + copy1 + " & sum of digit is " + sum);
		System.out.println("===================================");

		// Example 2

		int p = 256545;
		int copyp = p;
		int sum1 = 0;

		while (p > 0) {

			int r1 = p % 10;
			sum1 = sum1 + r1;
			p = p / 10;
		}
		System.out.println("Given number is " + copyp + " & sum of digit is " + sum1);
		System.out.println("Value of P is = "+p); // Here Value of P is changed to '0', because we have used while loop.
		System.out.println("===================================");
		
		int a1 = 254578;
		int copya1 = a1;
		
		int a2 = a1 % 10;
		int a3 = a1 / 10;
		
		System.out.println("Original value is = "+copya1+" & Mod is =  "+a2);
		System.out.println("Original value is = "+copya1+" & Division is =  "+a3);
		System.out.println("Value of a1 is =  "+a1); // Here Value of a1 won't be change because here we didn't use while loop.
		System.out.println("===================================");
	}
}
