package Nilam;

public class ReverseNumber {
	public static void main(String[] args) {

		int n = 34567;
		String rev = "";

		while (n > 0) {
			int r = n % 10;
			rev = rev + r;
			n = n / 10;

		}
		int rev1 = Integer.parseInt(rev);
		System.out.println(rev1);
	}

}
