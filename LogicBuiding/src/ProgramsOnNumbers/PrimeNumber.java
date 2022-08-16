package ProgramsOnNumbers;

public class PrimeNumber {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 100) {
			findPrimeNumber(i);
			i++;
		}

	}

	static void findPrimeNumber(int num) {
		boolean flag = true;
		int div = 2;

		while (div < num) {

			if (num % div == 0) {
				flag = false;
				break;
			}

			div++;
		}

		if (flag) {
			System.out.println(num + " I am prime number");
		} 
//			else {
//			System.out.println(num + " given Number is not prime");
//		}

	}
}
