package ProgramsOnNumbers;

public class ReverseNum {

	public static void main(String[] args) {

		int num = 7654;
		String rev = "";
		while (num > 0) {
			int r = num % 10;
			rev = rev + r;
			num = num / 10;
		}

		int revNum = Integer.parseInt(rev);
		System.out.println(revNum);

	}
}
