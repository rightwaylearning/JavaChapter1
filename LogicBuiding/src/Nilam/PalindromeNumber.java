package Nilam;

public class PalindromeNumber {
	public static void main(String[] args) {

		int n = 234543;
		String rev = "";
		int copyn = n;

		while (n > 0) {
			int r = n % 10;
			rev = rev + r;
			n = n / 10;

		}
		int rev1 = Integer.parseInt(rev);
		if (rev1 == copyn) {
			System.out.println("number is same");

		} else {
			System.out.println("number is different");
		}

	}

}


















class Palindrom{
	public static void main(String[] args) {
		
		int num = 789654;
		int copynum = num;
		String rev2 = "";
		
		while(num>0) {
			
			int result = num%10;
			rev2 =rev2+result;
			num= num/10;
		}
		int revers= Integer.parseInt(rev2);
		if(revers == copynum) {
			System.out.println("number is same");
				
		}else {
			System.out.println("number is diff.");
		}
	}
}




