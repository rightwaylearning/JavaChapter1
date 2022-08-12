package ProgramsOnNumbers;

public class CountDigitOfGivenNumber {

	public static void main(String[] args) {

		int n = 1000;
		int length = 0;
		while (n > 0) {
			length++;
			n = n / 10;
		}
		System.out.println(length);

	}
}
