package ProgramsOnNumbers;

public class PalindromNum {

	public static void main(String[] args) {
		int num = 7887;
		int copyOfNum = num;
		String rev = "";
		
		
		while(num > 0) {
			int r = num % 10;
			rev = rev + r;
			num =num/10;
		}
		
		int rev1 = Integer.parseInt(rev);
		
		if(rev1 == copyOfNum) {
			System.out.println("rev num is same");
		}else {
			System.out.println("rev num is diff.");
		}
	
		
	}
}
