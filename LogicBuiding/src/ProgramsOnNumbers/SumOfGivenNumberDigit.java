package ProgramsOnNumbers;

public class SumOfGivenNumberDigit {
//
	public static void main(String[] args) {
		int num = 1124;
		int copyOfNum = num;
		int sum = 0;
		//int product =1;

		while (num > 0) {
			int r = num % 10;
			sum = sum + r;
			//product = product*r;  //
			num = num / 10;
		}
	//	if (product==sum) {
			//System.out.println("spy number");
	//	}else {
			//System.out.println("not spy number");
		//}
	//System.out.println(product);
	System.out.println(" given number "+copyOfNum+" digit sum is = " + sum);
	}
}
